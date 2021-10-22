package com.htc.clinicagg.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.htc.clinicagg.model.ClinicAggregate;
;

@RequestMapping("/default")
public interface ClinicAggService {
	
	@GetMapping(value="/appointment/{id}",produces="application/json")
	ClinicAggregate getAppointment(@PathVariable int appointmentid);
	
}
