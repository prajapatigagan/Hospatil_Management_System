package com.gagan.Hospatil_Management_System.repository;

import com.gagan.Hospatil_Management_System.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}