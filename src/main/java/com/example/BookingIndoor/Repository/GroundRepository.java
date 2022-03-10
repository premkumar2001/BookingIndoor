package com.example.BookingIndoor.Repository;

import com.example.BookingIndoor.Model.Ground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroundRepository extends JpaRepository<Ground,Long> {

    Optional<Ground> findById(Long id);
}
