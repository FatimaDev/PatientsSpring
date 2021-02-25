package com.yaya.fatima.Dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.yaya.fatima.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
public Page<Patient> findByNameContains(String mc , Pageable pageable);
}
