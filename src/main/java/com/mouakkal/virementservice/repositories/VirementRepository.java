package com.mouakkal.virementservice.repositories;
import com.mouakkal.virementservice.entities.Virement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VirementRepository extends JpaRepository<Virement, Long> {
}