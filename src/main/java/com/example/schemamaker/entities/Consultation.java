package com.example.schemamaker.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_consultation", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConsultation;
    @Column(name = "dateRendezVous", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRendezVous;
    @Column(name = "tabagisme", nullable = false)
    private String tabagisme;

    @Column(name = "diabete", nullable = false)
    private String diabete;

    @Column(name = "poids", nullable = false)
    private Float poids;

    @Column(name = "taillem", nullable = false)
    private Float tailleM;

    @Column(name = "taillec")
    private Float tailleC;

    @Column(name = "tour_taille")
    private Float tourTaille;

    @Column(name = "freq_cardiaque")
    private Integer freqC;

    @Column(name = "pas", nullable = false)
    private Integer pas;

    @Column(name = "pad", nullable = false)
    private Integer pad;

    @Column(name = "souffle", nullable = false)
    private String souffle;

    @Column(name = "complication", nullable = false)
    private String complication;

    @Column(name = "glycemie_j")
    private Float glycemieJ;

    @Column(name = "hemoglobine")
    private Float hemoglobine;

    @Column(name = "cholesterol_total_mol")
    private Float cholesterolTotalMol;

    @Column(name = "cholesterol_total_g")
    private Float cholesterolTotalG;

    @Column(name = "hdl_mol")
    private Float hdlMol;

    @Column(name = "hdl_g")
    private Float hdlG;

    @Column(name = "ldl_mol")
    private Float ldlMol;

    @Column(name = "ldl_g")
    private Float ldlG;

    @Column(name = "triglycerides_mol")
    private Float triglyceridesMol;

    @Column(name = "triglycerides_g")
    private Float triglyceridesG;

    @Column(name = "creatine_m")
    private Float creatineM;

    @Column(name = "creatine_l")
    private Float creatinel;

    @Column(name = "uree_l")
    private Float ureeL;

    @Column(name = "uree_lg")
    private Float ureeLG;

    @Column(name = "filtration_globulaire")
    private Float filtrationGlo;

    @Column(name = "bondulette_urinaire")
    private String bonduletteUri;

    @Column(name = "albuminurie")
    private Float albuminurie;

    @Column(name = "proteinurie")
    private Float proteinurie;

    @Column(name = "asat")
    private Float asat;

    @Column(name = "alat")
    private Float alat;

    @Column(name = "tsh")
    private Float tsh;

    @Column(name = "kaliemie")
    private Float kaliemie;

    @Column(name = "vitamine_d")
    private Float vitamineD;

    @Column(name = "acide_urique")
    private Float acideUrique;

    @Column(name = "ecg_results", columnDefinition = "TEXT")
    private String ecgResults;

    @Column(name = "fo_results", columnDefinition = "TEXT")
    private String foResults;

    @Column(name = "mesures_hyg", nullable = false, columnDefinition = "TEXT")
    private String mesuresHyg;

    @Column(name = "anti_diabetique", nullable = false, columnDefinition = "TEXT")
    private String antiDiabetique;

    @Column(name = "traitement_prescrit", nullable = false, columnDefinition = "TEXT")
    private String traitementPre;

    @Column(name = "anti_hta", nullable = false, columnDefinition = "TEXT")
    private String antiHTA;

    @Column(name = "specialite")
    private String specialite;
    @ManyToOne
    private Patient patient;
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee prestataire;
}
