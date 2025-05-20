package com.clinics_appointment.onboard.enums;

public enum AppointmentStatus {

    SCHEDULED("Scheduled"),
    CANCELLED("Cancelled"),
    RESCHEDULED("Rescheduled"),
    COMPLETED("Completed"),
    NO_SHOW("NoShow"),
    INPROGRESS("Inprogress");

    private final String status;

    AppointmentStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}