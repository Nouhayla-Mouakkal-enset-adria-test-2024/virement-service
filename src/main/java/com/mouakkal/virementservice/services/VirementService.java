package com.mouakkal.virementservice.services;
import com.mouakkal.virementservice.entities.Virement;
import com.mouakkal.virementservice.repositories.VirementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VirementService {
    private final VirementRepository virementRepository;

    public VirementService(VirementRepository virementRepository) {
        this.virementRepository = virementRepository;
    }

    public List<Virement> findAll() {
        return virementRepository.findAll();
    }

    public Virement save(Virement virement) {
        return virementRepository.save(virement);
    }

    public void deleteById(Long id) {
        virementRepository.deleteById(id);
    }
}