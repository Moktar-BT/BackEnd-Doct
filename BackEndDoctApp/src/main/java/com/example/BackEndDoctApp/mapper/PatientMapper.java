package com.example.BackEndDoctApp.mapper;

import com.example.BackEndDoctApp.dto.PatientDto;
import com.example.BackEndDoctApp.entity.Patient;

import static org.apache.coyote.http11.Constants.a;

public class PatientMapper {
    public static PatientDto mapToPatientDto(Patient patient)
    {
        return new PatientDto(
                patient.getId(),
                patient.getNom(),
                patient.getPrenom()

        );
    }
    public static Patient mapToPatient (PatientDto patientDto){
        return new Patient(
                patientDto.getId(),
                patientDto.getNom(),
                patientDto.getPrenom()
        );

    }
}
