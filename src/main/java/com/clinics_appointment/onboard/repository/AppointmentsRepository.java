package com.clinics_appointment.onboard.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinics_appointment.onboard.entity.Appointments;

@Repository
public interface AppointmentsRepository extends JpaRepository<Appointments, UUID> {

}
