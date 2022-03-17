package com.example.BookingIndoor.Service;

import com.example.BookingIndoor.Model.BookingGround;
import com.example.BookingIndoor.Model.User;
import com.example.BookingIndoor.Repository.BookingRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookingService {
    BookingRepository bookingRepository;
    public  List<BookingGround> getbookingByUserId(User user){
        return bookingRepository.findAllByUser(user);
    }

    public void addBooking(BookingGround bm){
        bookingRepository.save(bm);
    }

    public List<BookingGround> getAllBooking(){
        return bookingRepository.findAll();
    }

public void  deletebooking(int Id){
        bookingRepository.deleteById(Id);
}

public BookingGround editBooking(int Id,BookingGround bm){
        BookingGround edit=bookingRepository.findById(Id).orElseThrow(()->new UsernameNotFoundException("booking by "+Id+"not found"));

        edit.setNoOfPersons(bm.getNoOfPersons());
        edit.setFromDate(bm.getFromDate());
        edit.setTodate(bm.getTodate());
        return bookingRepository.save(edit);
}

}
