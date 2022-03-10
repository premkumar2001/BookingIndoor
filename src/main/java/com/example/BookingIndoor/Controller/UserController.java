package com.example.BookingIndoor.Controller;
import com.example.BookingIndoor.Model.Ground;
import com.example.BookingIndoor.Model.User;
import com.example.BookingIndoor.Repository.UserRepository;
import com.example.BookingIndoor.Service.UserService;
import com.example.BookingIndoor.Service.GroundService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository repo;

    @Autowired
    private UserService service;

    @Autowired
    private GroundService serv;

    @Autowired
    private BCryptPasswordEncoder pwdEncoder;

    private String Default="ROLE_USER";

    @PostMapping("/register")
    private String loginByUser(@RequestBody User um){
        um.setRoles(Default);
        String pwd=um.getPassword();
        String encryptPwd=pwdEncoder.encode(pwd);
        um.setPassword(encryptPwd);
        User u=service.saveUser(um);
        return "Registration Successful";
    }

    @GetMapping("/dashboard")
    private ResponseEntity<List<Ground>> availableGround(){
        List<Ground> allGrounds= serv.availableGround();
        /*List<GroundModel> ground = null;
        for(GroundModel i:allGrounds){
            if((i.getGroundAvailableStatus()).equals("Available")){
                ground.add(i);
            }
        }*/
        return new ResponseEntity<>(allGrounds, HttpStatus.OK);
    }

    @GetMapping("/ground/{id}")
    public ResponseEntity<Optional<Ground>> findGround(@PathVariable(value="id") Long id){
        Optional<Ground> ground=serv.finByGroundId(id);
        return new ResponseEntity<>(ground,HttpStatus.OK);
    }

    @GetMapping("/bookedgrounds/{id}")
    public ResponseEntity<Optional<Ground>> findBookedGround(@PathVariable(value="id") int id){
        return null;
    }

}