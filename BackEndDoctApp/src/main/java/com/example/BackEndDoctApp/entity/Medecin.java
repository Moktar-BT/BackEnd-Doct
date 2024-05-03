package com.example.BackEndDoctApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Medecin")
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int  cin;
    private String nom;
    private String prenom;
    private String e_mail;
    private String password;
    private double prix_visite;
    private double longitude;
    private double latitude;
    private String adresse;
    private String specialite;


}
