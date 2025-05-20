package com.clinics_appointment.onboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "appointment_types", schema = "clinicals")
public class AppointmentTypes extends BaseEntity {

	@Column(name = "appointment_type")
	private String appointmentType;
	
	@Column(name = "actual_duration")
	private long actualDuration;
	
}
