package com.example.BookingIndoor.Repository;

import com.example.BookingIndoor.Model.BookingGround;
import com.example.BookingIndoor.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookingRepository extends JpaRepository<BookingGround,Integer> {
   // @Query("select a from bookingground a where a.fk_user_id=:Id")
     //List<BookingGround> findBookingbyUserId(@Param("Id") int Id);

List<BookingGround> findAllByUser(User user);


}
