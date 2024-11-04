package com.mouakkal.virementservice.web;
import com.mouakkal.virementservice.entities.Virement;
import com.mouakkal.virementservice.services.VirementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/virements")
public class VirementController {
    private final VirementService virementService;

    public VirementController(VirementService virementService) {
        this.virementService = virementService;
    }

    @GetMapping
    public List<Virement> getAllVirements() {
        return virementService.findAll();
    }

    @PostMapping
    public Virement addVirement(@RequestBody Virement virement) {
        return virementService.save(virement);
    }

    @DeleteMapping("/{id}")
    public void deleteVirement(@PathVariable Long id) {
        virementService.deleteById(id);
    }
}