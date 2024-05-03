package com.example.BackEndDoctApp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class MedecinDto {
        private Long id;
        private int cin;
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

