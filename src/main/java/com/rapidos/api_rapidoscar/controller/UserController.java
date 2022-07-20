package com.rapidos.api_rapidoscar.controller;

import com.rapidos.api_rapidoscar.entity.Role;
import com.rapidos.api_rapidoscar.entity.User;
import com.rapidos.api_rapidoscar.models.RoleName;
import com.rapidos.api_rapidoscar.models.SingupModel;
import com.rapidos.api_rapidoscar.repository.RoleRepository;
import com.rapidos.api_rapidoscar.repository.UserRepository;
import com.rapidos.api_rapidoscar.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    PasswordEncoder encoder;

    UserRepository userRepository;

    RoleRepository roleRepository;

    private ServiceUser serviceUser;

    public UserController(ServiceUser serviceClient) {
        this.serviceUser = serviceUser;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAll(){
        try{
            return new ResponseEntity<>(serviceUser.getAll(),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@Validated() @RequestBody() SingupModel singupModel){
        try{
            if(userRepository.existsByUsername(singupModel.getUsername())){
                return new ResponseEntity<String>("l'utilisateur existe deja",HttpStatus.BAD_REQUEST);
            }
            if(userRepository.existsByEmail(singupModel.getEmail())){
                return new ResponseEntity<String>("l'utilisateur existe deja",HttpStatus.BAD_REQUEST);
            }
            User user = new User();
            Set<String> strRoles = singupModel.getRole();
            Set<Role> roles = new HashSet<>();
            strRoles.forEach(role -> {
                switch (role) {
                    case "admin":
                        try{
                            Role adminRole = roleRepository.findByName(RoleName.ROLE_ADMIN);
                            roles.add(adminRole);
                        }catch (Exception e){
                            e.getMessage();
                        }
                        break;

                    case "agence":
                        try{
                            Role agenceRole = roleRepository.findByName(RoleName.ROLE_AGENCE);
                            roles.add(agenceRole);
                        }catch (Exception e){
                            e.getMessage();
                        }
                        break;

                    case "user":
                        try{
                            Role userRole = roleRepository.findByName(RoleName.ROLE_USER);
                            roles.add(userRole);
                        }catch (Exception e){
                            e.getMessage();
                        }
                        break;

                }
            });
            user.setNom(singupModel.getNom());
            user.setPrenom(singupModel.getPrenom());
            user.setEmail(singupModel.getEmail());
            user.setTelephone(singupModel.getTelephone());
            user.setPassword(encoder.encode(singupModel.getPassword()));
            user.setNumcni(singupModel.getNumcni());
            user.setUsername(singupModel.getUsername());
            user.setRoles(roles);
            userRepository.save(user);
            return ResponseEntity.ok().body("Utilidateur ajouté avec success");
        }catch (Exception e){
            return  new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
        }

    }
}
