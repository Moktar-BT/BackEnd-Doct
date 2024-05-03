package com.example.BackEndDoctApp.service.impl;

import com.example.BackEndDoctApp.dto.MedecinDto;
import com.example.BackEndDoctApp.entity.Medecin;
import com.example.BackEndDoctApp.mapper.MedecinMapper;
import com.example.BackEndDoctApp.repository.MedecinRepository;
import com.example.BackEndDoctApp.service.MedecinService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MedecinServiceImpl implements MedecinService {
    private MedecinRepository medecinRepository;
    @Override
    public MedecinDto createMedecin (MedecinDto medecinDto){
        Medecin medecin = MedecinMapper.mapToMedecin(medecinDto);
        Medecin savedMedecin = medecinRepository.save(medecin);
        return MedecinMapper.mapToMedecinDto(savedMedecin);
    }


}
