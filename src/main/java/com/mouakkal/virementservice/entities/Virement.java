package com.mouakkal.virementservice.entities;

import com.mouakkal.virementservice.enums.Type;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Virement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long beneficiaireId;
    private Long ribSource;
    private Double montant;
    private String description;
    private Date dateVirement;
    private Type type;
}