package com.example.schemamaker.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String CIN;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String sexe;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @ManyToOne(fetch = FetchType.LAZY)
    private Provenance provenance;
    @ManyToOne(fetch = FetchType.LAZY)
    private Couverture couverture;
    @ManyToOne(fetch = FetchType.LAZY)
    private Antecedent antecedent;

}
