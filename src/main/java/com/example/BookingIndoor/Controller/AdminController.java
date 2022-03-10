package com.example.BookingIndoor.Controller;

import com.example.BookingIndoor.Model.Ground;
import com.example.BookingIndoor.Model.User;
import com.example.BookingIndoor.Service.GroundService;
import com.example.BookingIndoor.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService service;

    @Autowired
    private GroundService serv;

    @Autowired
    public BCryptPasswordEncoder pwdEncoder;

    public String Default="ROLE_ADMIN";

    @PostMapping("/register")
    public String saveAdmin(@RequestBody User um){
        um.setRoles(Default);
        String pwd=um.getPassword();
        String encryptPwd=pwdEncoder.encode(pwd);
        um.setPassword(encryptPwd);
        service.saveAdmin(um);
        return "Registration Successful";
    }

    @GetMapping("/dashboard")
    public ResponseEntity<List<Ground>> availableGround(){
        List<Ground> available=serv.availableGround();
        return new ResponseEntity<>(available, HttpStatus.OK);
    }

    @PostMapping("/addGround")
    public Ground addGround(@RequestBody Ground gm){
        return serv.saveGround(gm);
    }

    @PutMapping("/editGround/{id}")
    public ResponseEntity<Ground> editGround(@RequestBody Ground gm){
        Ground edit=serv.editGround(gm);
        return new ResponseEntity<>(edit,HttpStatus.OK);
    }

    @DeleteMapping("/deleteGround/{id}")
    public ResponseEntity<?> deleteGround(@PathVariable(value="id") Long id){
        serv.deleteGround(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
