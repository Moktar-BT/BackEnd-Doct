package com.example.BackEndDoctApp.mapper;

import com.example.BackEndDoctApp.dto.MedecinDto;
import com.example.BackEndDoctApp.entity.Medecin;

public class MedecinMapper {
    public static MedecinDto mapToMedecinDto(Medecin medecin){
        return new MedecinDto(
                medecin.getId(),
                medecin.getCin(),
                medecin.getNom(),
                medecin.getPrenom(),
                medecin.getE_mail(),
                medecin.getPassword(),
                medecin.getPrix_visite(),
                medecin.getLongitude(),
                medecin.getLatitude(),
                medecin.getAdresse(),
                medecin.getSpecialite()
                );
    }
    public static Medecin mapToMedecin(MedecinDto medecinDto){
        return new Medecin(
                medecinDto.getId(),
                medecinDto.getCin(),
                medecinDto.getNom(),
                medecinDto.getPrenom(),
                medecinDto.getE_mail(),
                medecinDto.getPassword(),
                medecinDto.getPrix_visite(),
                medecinDto.getLongitude(),
                medecinDto.getLatitude(),
                medecinDto.getAdresse(),
                medecinDto.getSpecialite()
                );
    }
}
