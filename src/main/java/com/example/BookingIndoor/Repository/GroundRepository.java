package com.example.BookingIndoor.Repository;

import com.example.BookingIndoor.Model.GroundModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroundRepository extends JpaRepository<GroundModel,Long> {

    Optional<GroundModel> findById(Long id);
}
