package com.htc.patient.persistence;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.htc.patient.model.Patient;


@RepositoryRestResource(collectionResourceRel="patient",path="patient")
public interface PatientServiceRepository extends PagingAndSortingRepository<Patient,Long> {
	
	List<Patient> findByPatientId(@Param("patientId") Long patientId);
}
