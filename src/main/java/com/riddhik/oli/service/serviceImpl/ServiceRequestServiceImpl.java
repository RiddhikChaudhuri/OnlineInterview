package com.riddhik.oli.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riddhik.oli.service.domain.ServiceRequest;
import com.riddhik.oli.service.entity.ServiceRequestEntity;
import com.riddhik.oli.service.repository.ServiceRequestRepository;
import com.riddhik.oli.service.service.ServiceRequestEntityTransform;
import com.riddhik.oli.service.service.ServiceRequestService;
import com.riddhik.oli.service.service.ServiceRequestTransform;

@Service
public class ServiceRequestServiceImpl implements ServiceRequestService {

    @Autowired
    ServiceRequestRepository serviceRepository;

    @Autowired
    ServiceRequestTransform serviceRequestTransform;

    @Autowired
    ServiceRequestEntityTransform serviceRequestEntityTransform;

    @Override
    public void createNewServiceRequest(ServiceRequest serviceRequest) {
	serviceRepository.save(serviceRequestEntityTransform.createServiceRequestEntity(serviceRequest));
    }

    @Override
    public List<ServiceRequest> searchByJobDescription(String jobDescription) {
	List<ServiceRequest> serviceSearchByJobDescription = new ArrayList<>();

	for (ServiceRequestEntity serviceRequestEntity : serviceRepository.findByJobDescription(jobDescription)) {
	    serviceSearchByJobDescription.add(serviceRequestTransform.createServiceRequest(serviceRequestEntity));
	}
	return serviceSearchByJobDescription;
    }

}