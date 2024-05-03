package com.example.BackEndDoctApp.controller;

import com.example.BackEndDoctApp.dto.MedecinDto;
import com.example.BackEndDoctApp.service.MedecinService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/medecins")
public class MedecinController {
    private MedecinService medecinService;

    //Build Add Patient Rest API
    @PostMapping
    public ResponseEntity<MedecinDto> createMedecin(@RequestBody MedecinDto medecinDto){
        MedecinDto savedMedecin = medecinService.createMedecin(medecinDto);
        return new ResponseEntity<>(savedMedecin, HttpStatus.CREATED);
    }


}
