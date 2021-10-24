package com.htc.clinicservice.persistence;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.htc.clinicservice.model.Clinic;

@RepositoryRestResource(collectionResourceRel="clinic",path="clinic")
public interface ClinicServiceRepository extends PagingAndSortingRepository<Clinic,Long> {

	List<Clinic> findByAppId(@Param("appId") Long appId);
}
