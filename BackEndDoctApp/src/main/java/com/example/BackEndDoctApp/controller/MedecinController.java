package com.example.BackEndDoctApp.controller;

import com.example.BackEndDoctApp.dto.MedecinDto;
import com.example.BackEndDoctApp.service.MedecinService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medecins")
@CrossOrigin(origins = "http://localhost:5173")
public class MedecinController {

    private final MedecinService medecinService;

    public MedecinController(MedecinService medecinService) {
        this.medecinService = medecinService;
    }

    // Build Add Medecin Rest API
    @PostMapping
    public ResponseEntity<MedecinDto> createMedecin(@RequestBody MedecinDto medecinDto) {
        MedecinDto savedMedecin = medecinService.createMedecin(medecinDto);
        return new ResponseEntity<>(savedMedecin, HttpStatus.CREATED);
    }
}
