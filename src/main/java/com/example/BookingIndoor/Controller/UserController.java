package com.example.BookingIndoor.Controller;
import com.example.BookingIndoor.Model.GroundModel;
import com.example.BookingIndoor.Model.UserModel;
import com.example.BookingIndoor.Repository.UserRepository;
import com.example.BookingIndoor.Service.UserService;
import com.example.BookingIndoor.Service.GroundService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository repo;
    private UserService service;
    @Autowired
    private GroundService serv;


    @PostMapping("/register")
    private String loginByUser(@RequestBody UserModel lm){
        service.saveUser(lm);
        return "Registration Successful";
    }

    @GetMapping("/dashboard")
    private ResponseEntity<List<GroundModel>> availableGround(){
        List<GroundModel> allGrounds= serv.availableGround();
        /*List<GroundModel> ground = null;
        for(GroundModel i:allGrounds){
            if((i.getGroundAvailableStatus()).equals("Available")){
                ground.add(i);
            }
        }*/
        return new ResponseEntity<>(allGrounds, HttpStatus.OK);
    }
}