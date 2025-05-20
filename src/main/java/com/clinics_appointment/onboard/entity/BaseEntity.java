package com.clinics_appointment.onboard.entity;

import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {

	@Id
	@GeneratedValue(generator = "UUID")
	private UUID id;
	
	@Column(name = "active")
	private boolean isActive = true;
	
	@Column(name = "created_by")
	private UUID createdBy;
	
	@Column(name = "modified_by")
	private UUID modifiedBy;
	
	@Column(name = "updated_on")
	private Timestamp updatedOn;
	
	@Column(name = "created_on")
	private Timestamp createdOn;
}
