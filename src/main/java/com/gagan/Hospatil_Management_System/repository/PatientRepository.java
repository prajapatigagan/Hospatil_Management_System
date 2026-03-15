package com.gagan.Hospatil_Management_System.repository;

import com.gagan.Hospatil_Management_System.entity.Patient;
import com.gagan.Hospatil_Management_System.entity.type.BloodGroupType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByName(String name);
    List<Patient> findByBirthdateOrEmail(LocalDate birthdate,String email);
//    List<Patient> findByStartDateBetween(LocalDate startDate, LocalDate endDate);
//    List<Patient> findByNameContainingOredrByIdDesc(String query);
    @Query("SELECT p FROM Patient p WHERE p.blood_group = ?1")
    List<Patient> findByBloodGroup(BloodGroupType blood_group);
}
