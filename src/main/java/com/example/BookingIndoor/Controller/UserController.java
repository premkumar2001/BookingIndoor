package com.example.BookingIndoor.Controller;
import com.example.BookingIndoor.Model.BookingGround;
import com.example.BookingIndoor.Model.Ground;
import com.example.BookingIndoor.Model.User;
import com.example.BookingIndoor.Repository.BookingRepository;
import com.example.BookingIndoor.Repository.UserRepository;
import com.example.BookingIndoor.Service.UserService;
import com.example.BookingIndoor.Service.GroundService;
import com.example.BookingIndoor.Service.bookingService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    private bookingService bookserv;


    @PostMapping("/register")
    private String loginByUser(@RequestBody User lm){
        service.saveUser(lm);
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

    @GetMapping("/groundById/{id}")
    public ResponseEntity<Optional<Ground>> findGround(@PathVariable(value="id") Long id){
        Optional<Ground> ground=serv.finByGroundId(id);
        return new ResponseEntity<>(ground,HttpStatus.OK);
    }
    @PostMapping("/addbooking")
    public ResponseEntity<String> addBooking(@RequestBody BookingGround bm){
        bookserv.addBooking(bm);
        return new ResponseEntity<>("Succesfully",HttpStatus.CREATED);

    }
    @PutMapping("/editbooking/{BookingId}")
    public ResponseEntity<BookingGround> editbooking(@PathVariable(value="BookingId") int BookiingId ,@RequestBody BookingGround bm) {
        BookingGround edit = bookserv.editBooking(BookiingId, bm);
        return new ResponseEntity<>(edit, HttpStatus.OK);
    }

       @DeleteMapping("/deletebooking/{BookingId}")
               public ResponseEntity<String> deletebooking(@PathVariable(value="BookingId") int BookingId){
        bookserv.deletebooking(BookingId);
        return new ResponseEntity<>("Deleted",HttpStatus.OK);

        }

        @GetMapping("/getbookings/{Id}")
    public ResponseEntity<List<BookingGround>> getbookings(@PathVariable(value="Id") User user){
            List<BookingGround> bookings= bookserv.getbookingByUserId(user);
            return new ResponseEntity<>(bookings,HttpStatus.OK);
        }


}