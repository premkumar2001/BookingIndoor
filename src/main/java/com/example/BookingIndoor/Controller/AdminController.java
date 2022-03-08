package com.example.BookingIndoor.Controller;

import com.example.BookingIndoor.Model.GroundModel;
import com.example.BookingIndoor.Service.GroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private GroundService serv;

    @GetMapping("/dashboard")
    public ResponseEntity<List<GroundModel>> availableGround(){
        List<GroundModel> available=serv.availableGround();
        return new ResponseEntity<>(available, HttpStatus.OK);
    }

    @PostMapping("/addGround")
    public GroundModel addGround(@RequestBody GroundModel gm){
        return serv.saveGround(gm);
    }

    @PutMapping("/editGround/{id}")
    public ResponseEntity<GroundModel> editGround(@RequestBody GroundModel gm){
        GroundModel edit=serv.editGround(gm);
        return new ResponseEntity<>(edit,HttpStatus.OK);
    }

    @DeleteMapping("/deleteGround/{id}")
    public ResponseEntity<?> deleteGround(@PathVariable(value="id") Long id){
        serv.deleteGround(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
