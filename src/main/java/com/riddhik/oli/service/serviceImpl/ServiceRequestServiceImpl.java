package com.riddhik.oli.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riddhik.oli.service.entity.ServiceRequest;
import com.riddhik.oli.service.repository.ServiceRequestRepository;
import com.riddhik.oli.service.service.ServiceRequestService;

@Service
public class ServiceRequestServiceImpl implements ServiceRequestService {

    @Autowired
    ServiceRequestRepository serviceRepository;

    @Override
    public List<ServiceRequest> searchByJobDescription(String jobDescription) {
        List<ServiceRequest> serviceSearchByJobDescription = serviceRepository.findByJobDescription("IT Engineer");
        return serviceSearchByJobDescription;
    }

    @Override
    public void createNewServiceRequest(ServiceRequest serviceRequest) {
        serviceRepository.save(serviceRequest);
    }

}
