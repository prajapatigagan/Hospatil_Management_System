package com.gagan.Hospatil_Management_System.Services;

import com.gagan.Hospatil_Management_System.entity.Appoinment;
import com.gagan.Hospatil_Management_System.entity.Doctor;
import com.gagan.Hospatil_Management_System.entity.Patient;
import com.gagan.Hospatil_Management_System.repository.AppoinmentRepository;
import com.gagan.Hospatil_Management_System.repository.DoctorRepository;
import com.gagan.Hospatil_Management_System.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppoinmentService {
    private final AppoinmentRepository appoinmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    public Appoinment createNewAppointment(Appoinment appoinment,Long doctorId,Long patientId) {
        Doctor doctor=doctorRepository.findById(doctorId).orElseThrow();
        Patient patient=patientRepository.findById(patientId).orElseThrow();

        if(appoinment.getId()!=null)throw new IllegalArgumentException("Appoinment should not have");

        appoinment.setPatient(patient);
        appoinment.setDoctor(doctor);

        patient.getAppoinments().add(appoinment);//to maintain consistency

        appoinmentRepository.save(appoinment);
        return appoinment;
    }
}
