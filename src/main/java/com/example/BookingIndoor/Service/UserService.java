package com.example.BookingIndoor.Service;

import com.example.BookingIndoor.Model.BookingGround;
import com.example.BookingIndoor.Model.User;
import com.example.BookingIndoor.Repository.BookingRepository;
import com.example.BookingIndoor.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Configurable
public class UserService {
    @Autowired
    UserRepository repo;

    public User saveUser(User lm) {
        return repo.save(lm);
    }

    public void saveAdmin(User um) {
        repo.save(um);
    }

}
