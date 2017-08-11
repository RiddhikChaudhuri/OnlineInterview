package com.riddhik.oli.service.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.riddhik.oli.service.entity.ServiceRequest;

@Repository
public interface ServiceRequestRepository extends CrudRepository<ServiceRequest, Integer> {

    public List<ServiceRequest> findByJobDescription(String jobDescription);

    public ServiceRequest findByContactDetailsRecruitedId(Integer position);

}
