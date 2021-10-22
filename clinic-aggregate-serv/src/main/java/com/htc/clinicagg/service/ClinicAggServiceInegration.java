package com.htc.clinicagg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.htc.clinicagg.caller.AppointmentCaller;
import com.htc.clinicagg.caller.PatientServiceCaller;
import com.htc.clinicagg.model.Appointment;
import com.htc.clinicagg.model.ClinicAggregate;
import com.htc.clinicagg.model.Patient;


@RestController
public class ClinicAggServiceInegration implements ClinicAggService {
	
	@Autowired
	private AppointmentCaller rc;
	
	@Autowired
	private PatientServiceCaller bsc;
	

	
	@Override
	public ClinicAggregate getAppointment(int appointmentid) {
		
		ClinicAggregate ra = new ClinicAggregate();
		Appointment r = new Appointment();
		r = rc.getAppointmentById(appointmentid);
		

		ra.setAppointmentId(r.getAppoitmentId());
		ra.setfName(r.getPatientName());
		ra.setAppointmentId(r.getAppoitmentId());
		
		
		List<Patient> patientId = new ArrayList<>();
		//patientId.addAll(bsc.findByPatientId(appointmentid));

		ra.setPatient(patientId);
		
//		List<Users> users = new ArrayList<>();
//		for(Bookings booking:bookings) {
//			users.addAll(usc.findByUserId(booking.getUserId()).getContent());
//		}
//		System.out.println(users);
//		ra.setUsers(users);
		
		return ra;
	}

}
