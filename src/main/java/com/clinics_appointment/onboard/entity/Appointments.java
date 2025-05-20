package com.clinics_appointment.onboard.entity;

import java.time.LocalDateTime;

import com.clinics_appointment.onboard.enums.AppointmentStatus;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
	
	
	@Column(name = "appointment_date", nullable = false)
	private LocalDateTime appointmentDate;
	
	@Column(name = "appointment_duration", nullable = false)
	private long appointmentDuration;
	
	@Column(name = "location")
	private String location; // Location varies like virtual, physical communication
	
	@Column(name = "additional_notes")
	private String additionalNotes; //Add any additional notes or special requirements
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private AppointmentStatus appointmentStatus;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonManagedReference
	@JoinColumn(name = "therapist_id")
	private Therapist therapists;
	
	@OneToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;
}
