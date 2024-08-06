package com.example.schemamaker;

import com.example.schemamaker.entities.Antecedent;
import com.example.schemamaker.entities.Couverture;
import com.example.schemamaker.entities.Provenance;
import com.example.schemamaker.repositories.AntecedantRepository;
import com.example.schemamaker.repositories.CouvertureRepository;
import com.example.schemamaker.repositories.ProvenanceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SchemaMakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchemaMakerApplication.class, args);
    }
    @Bean
    public CommandLineRunner loadData(ProvenanceRepository provenanceRepository,
                                      CouvertureRepository couvertureRepository,
                                      AntecedantRepository antecedentRepository) {
        return args -> {
            // Provenance data
            provenanceRepository.save(new Provenance(null, "Casablanca"));
            provenanceRepository.save(new Provenance(null, "Rabat"));
            provenanceRepository.save(new Provenance(null, "Fes"));

            // Couverture data
            couvertureRepository.save(new Couverture(null, "CMU"));
            couvertureRepository.save(new Couverture(null, "RAMED"));

            // Antecedent data
            antecedentRepository.save(new Antecedent(null, "Diabète"));
            antecedentRepository.save(new Antecedent(null, "Hypertension"));
        };
    }
}
