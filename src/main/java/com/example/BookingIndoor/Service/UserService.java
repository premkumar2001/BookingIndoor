package com.example.BookingIndoor.Service;

import com.example.BookingIndoor.Model.UserModel;
import com.example.BookingIndoor.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository repo;

    public void saveUser(UserModel lm) {
        repo.save(lm);
    }
}
