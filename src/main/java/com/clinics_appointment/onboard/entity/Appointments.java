package com.clinics_appointment.onboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "appointments", schema = "clinicals")
public class Appointments {

	@ManyToOne
	@JoinColumn(name = "appointment_type_id", nullable = false)
	private AppointmentTypes appointmentTypes;
	
	
}
