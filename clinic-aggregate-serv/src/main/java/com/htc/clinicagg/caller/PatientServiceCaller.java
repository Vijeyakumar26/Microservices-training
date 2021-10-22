package com.htc.clinicagg.caller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.htc.clinicagg.model.Patient;

@FeignClient("patient-service")
@Component
public interface PatientServiceCaller {
	
	@GetMapping("/patient/search/findByPatientId")
	CollectionModel<Patient> findByPatientId(@RequestParam("patientId") int patientId);
	
}
