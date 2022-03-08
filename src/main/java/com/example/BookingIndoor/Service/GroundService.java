package com.example.BookingIndoor.Service;

import com.example.BookingIndoor.Model.GroundModel;
import com.example.BookingIndoor.Repository.GroundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Configurable
public class GroundService {

    @Autowired
    private GroundRepository repo;

    public List<GroundModel> availableGround() {
        return repo.findAll();
    }

    public GroundModel saveGround(GroundModel gm) {
        return repo.save(gm);
    }

    public GroundModel editGround(GroundModel gm) {
        return repo.save(gm);
    }

    @Transactional
    public void deleteGround(Long id) {
        repo.deleteById(id);
    }
}
