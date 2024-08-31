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
            provenanceRepository.save(new Provenance(null, "Tanger-Tétouan-Al Hoceïma"));
            provenanceRepository.save(new Provenance(null, "L'Oriental"));
            provenanceRepository.save(new Provenance(null, "Fès-Meknès"));
            provenanceRepository.save(new Provenance(null, "Rabat-Salé-Kénitra"));
            provenanceRepository.save(new Provenance(null, "Béni Mellal-Khénifra"));
            provenanceRepository.save(new Provenance(null, "Casablanca-Settat"));
            provenanceRepository.save(new Provenance(null, "Marrakech-Safi"));
            provenanceRepository.save(new Provenance(null, "Drâa-Tafilalet"));
            provenanceRepository.save(new Provenance(null, "Souss-Massa"));
            provenanceRepository.save(new Provenance(null, "Guelmim-Oued Noun"));
            provenanceRepository.save(new Provenance(null, "Laâyoune-Sakia El Hamra"));
            provenanceRepository.save(new Provenance(null, "Dakhla-Oued Ed-Dahab"));
             ;

            // Couverture data
            couvertureRepository.save(new Couverture(null, "CMU"));
            couvertureRepository.save(new Couverture(null, "RAMED"));
            couvertureRepository.save(new Couverture(null, "Assurance Privée"));
            couvertureRepository.save(new Couverture(null, "CNOPS"));
            couvertureRepository.save(new Couverture(null, "CNSS"));
            couvertureRepository.save(new Couverture(null, "Mutuelle des Forces Armées Royales"));
            couvertureRepository.save(new Couverture(null, "Mutuelle Générale des Travailleurs au Maroc"));

// Antecedent data
            antecedentRepository.save(new Antecedent(null, "Diabète"));
            antecedentRepository.save(new Antecedent(null, "Hypertension"));
            antecedentRepository.save(new Antecedent(null, "Maladies Cardiovasculaires"));
            antecedentRepository.save(new Antecedent(null, "Asthme"));
            antecedentRepository.save(new Antecedent(null, "Insuffisance Rénale"));
            antecedentRepository.save(new Antecedent(null, "Cancer"));
            antecedentRepository.save(new Antecedent(null, "Tuberculose"));
            antecedentRepository.save(new Antecedent(null, "Anémie"));
            antecedentRepository.save(new Antecedent(null, "Obésité"));

        };
    }
}
