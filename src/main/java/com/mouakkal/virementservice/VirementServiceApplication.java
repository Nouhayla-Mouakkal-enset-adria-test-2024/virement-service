package com.mouakkal.virementservice;

import com.mouakkal.virementservice.entities.Virement;
import com.mouakkal.virementservice.enums.Type;
import com.mouakkal.virementservice.services.VirementService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class VirementServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(VirementServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(VirementService virementService) {
        return args -> {
            // Création de 10 virements de test de façon dynamique
            for (int i = 1; i <= 10; i++) {
                Virement virement = new Virement();
                virement.setBeneficiaireId((long) i); // Utilisation d'un ID de bénéficiaire unique pour chaque virement
                virement.setRibSource(761234567890L + i); // Génération d'un RIB source unique
                virement.setMontant(100.0 * i); // Montant de virement (100, 200, etc.)
                virement.setDescription("Virement de test " + i);
                virement.setDateVirement(new Date());
                virement.setType(i % 2 == 0 ? Type.NORMAL : Type.INSTANTANE); // Utilisation de l'énumération Type
                virementService.save(virement);
            }

            // Affichage des virements ajoutés
            virementService.findAll().forEach(System.out::println);
        };
    }
}