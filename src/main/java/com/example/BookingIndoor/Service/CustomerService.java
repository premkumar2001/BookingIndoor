package com.example.BookingIndoor.Service;

import com.example.BookingIndoor.Model.Customer;
import com.example.BookingIndoor.Model.User;
import com.example.BookingIndoor.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements UserDetailsService {
    @Autowired
    UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> lm=repo.findByMailId(s);
        lm.orElseThrow(()->new UsernameNotFoundException("Not Found: "+s));
        return lm.map(Customer::new).get();
    }
}
