package com.clinics_appointment.onboard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/appointments")
public class AppointmentController {

	public String createAppointment() {
		return "Created Successfully";
	}
}
