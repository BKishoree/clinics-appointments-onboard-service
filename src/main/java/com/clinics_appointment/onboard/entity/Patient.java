package com.clinics_appointment.onboard.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name = "patients", schema = "clinicals")
public class Patient extends BaseEntity {

	private String userName;
	
	private String email;
	
	private String phoneNumber;
	
	private String phoneCode;
	
	private String country;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "patient_therapists", joinColumns = @JoinColumn(referencedColumnName = "patient_id"),
	inverseJoinColumns = @JoinColumn(referencedColumnName = "therapist_id"))
	private Therapist therapist;

	@Column(name = "therapist_id")
	private UUID therapistId;

//	@OneToMany(mappedBy = "patient", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<Appointment> appointments = new ArrayList<>();
	
}
