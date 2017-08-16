package com.riddhik.oli.service.service;

import java.util.List;

import com.riddhik.oli.service.domain.ServiceRequest;

public interface ServiceRequestService {

    public void createNewServiceRequest(ServiceRequest serviceRequest);

    public List<ServiceRequest> searchByJobDescription(String jobDescription);

}
