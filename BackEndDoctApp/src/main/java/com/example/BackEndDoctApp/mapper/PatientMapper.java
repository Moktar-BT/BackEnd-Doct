package com.example.BackEndDoctApp.mapper;

import com.example.BackEndDoctApp.dto.PatientDto;
import com.example.BackEndDoctApp.entity.Patient;

import static org.apache.coyote.http11.Constants.a;

public class PatientMapper {
    public static PatientDto mapToPatientDto(Patient patient)
    {
        return new PatientDto(
                patient.getId(),
                patient.getCin(),
                patient.getNom(),
                patient.getPrenom(),
                patient.getMail(),
                patient.getPassword(),
                patient.getNbRdvRate()

        );
    }
    public static Patient mapToPatient (PatientDto patientDto){
        return new Patient(
                patientDto.getId(),
                patientDto.getCin(),
                patientDto.getNom(),
                patientDto.getPrenom(),
                patientDto.getMail(),
                patientDto.getPassword(),
                patientDto.getNbRdvRate()
        );

    }
}
