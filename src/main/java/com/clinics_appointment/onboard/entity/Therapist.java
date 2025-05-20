package com.clinics_appointment.onboard.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
@Table(name = "therapists", schema = "clinicals")
public class Therapist extends BaseEntity {

	private String name;
	
	private String designation;
	
	private String phoneNumber;
	
	private String phoneCode;
	
	private String country;
	
	private String organization;
	
	@OneToMany(mappedBy = "therapists", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Appointments> appointments;
	
	@ManyToMany(mappedBy = "therapist", fetch = FetchType.LAZY)
	@JsonBackReference
	private Set<Patient> patients = new HashSet<>();
}
