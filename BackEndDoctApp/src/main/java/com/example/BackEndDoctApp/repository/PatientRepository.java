package com.example.BackEndDoctApp.repository;

import com.example.BackEndDoctApp.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {


}
