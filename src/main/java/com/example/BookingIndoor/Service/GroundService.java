package com.example.BookingIndoor.Service;

import com.example.BookingIndoor.Model.Ground;
import com.example.BookingIndoor.Repository.GroundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Configurable
public class GroundService {

    @Autowired
    private GroundRepository repo;

    public List<Ground> availableGround() {
        return repo.findAll();
    }

    public Ground saveGround(Ground gm) {
        return repo.save(gm);
    }

    public Ground editGround(Ground gm) {
        return repo.save(gm);
    }

    @Transactional
    public void deleteGround(Long id) {
        repo.deleteById(id);
    }

    public Optional<Ground> finByGroundId(Long id) {
        return repo.findById(id);
    }
}
