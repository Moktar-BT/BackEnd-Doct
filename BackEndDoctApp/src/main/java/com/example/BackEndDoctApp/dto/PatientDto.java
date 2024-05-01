package com.example.BackEndDoctApp.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto {
    private Long id;
    private int cin;
    private String nom;
    private String prenom;
    private String mail;
    private String password;
    private int nbRdvRate;

}
