package com.oli.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.oli.service.entity.ServiceRequest;

public interface ServiceRequestRepository extends CrudRepository<ServiceRequest, Integer> {

    public ServiceRequest findByJobDescription(String jobDescription);

}
