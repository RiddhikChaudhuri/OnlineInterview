package com.riddhik.oli.service.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import com.riddhik.oli.service.entity.ServiceRequestEntity;

@Repository
@Validated
public interface ServiceRequestRepository extends CrudRepository<ServiceRequestEntity, Integer> {

    public ServiceRequestEntity findByContactDetailsRecruitedId(Integer position);

    public List<ServiceRequestEntity> findByJobDescription(String jobDescription);

}
