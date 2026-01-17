package com.pm.patient_service.repository;

import com.pm.patient_service.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {
    boolean existsByEmail(String email);
<<<<<<< HEAD

    boolean existsByEmailAndIdNot(String email, UUID id);
=======
>>>>>>> c2adf5d8fe1183a733b3867735e5b755b8faf3ea
}
