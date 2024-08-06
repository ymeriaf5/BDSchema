package com.example.schemamaker.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date dateConsultation;
    private String prestataire;
    private String motifConsultation;
    private String signesFonctionnels;
    private String signesPhysiques;
    private String diagnostics;
    private String examensParacliniques;
    private String resultatsExamens;
    private String traitementsPrescrits;
    private String posologie;
    private String recommandations;
    private String referenceInfo; // Renamed from 'references'
    private Date prochainRendezVous;
    private String remarquesSuivi;
    @ManyToOne
    private Patient patient;
}
