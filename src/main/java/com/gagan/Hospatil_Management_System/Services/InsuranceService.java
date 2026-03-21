package com.gagan.Hospatil_Management_System.Services;

import com.gagan.Hospatil_Management_System.repository.InsuranceRepository;
import com.gagan.Hospatil_Management_System.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {
    private InsuranceRepository insuranceRepository;
    private PatientRepository patientRepository;
}
