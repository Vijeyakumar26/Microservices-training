package com.htc.clinicagg.caller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.clinicagg.model.Appointment;

@FeignClient("appointment-serv")
public interface AppointmentCaller {
	
	@GetMapping("/api/appointments/{id}")
	Appointment getAppointmentById(@PathVariable int appointmentid);
	
}
