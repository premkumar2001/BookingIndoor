package com.example.BookingIndoor.Repository;

import com.example.BookingIndoor.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer> {


    Optional<UserModel> findByMailId(String mailId);
}