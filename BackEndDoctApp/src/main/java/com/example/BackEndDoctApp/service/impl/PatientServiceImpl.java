package com.example.BackEndDoctApp.service.impl;

import com.example.BackEndDoctApp.dto.PatientDto;
import com.example.BackEndDoctApp.entity.Patient;
import com.example.BackEndDoctApp.mapper.PatientMapper;
import com.example.BackEndDoctApp.repository.PatientRepository;
import com.example.BackEndDoctApp.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;

    @Override
    public PatientDto createPatient(PatientDto patientDto) {
        Patient patient = PatientMapper.mapToPatient(patientDto);
        Patient savedPatient =patientRepository.save(patient);
        return PatientMapper.mapToPatientDto(savedPatient);
    }
}
