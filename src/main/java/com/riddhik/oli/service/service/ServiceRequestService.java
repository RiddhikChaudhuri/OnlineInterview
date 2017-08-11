package com.riddhik.oli.service.service;

import java.util.List;

import com.riddhik.oli.service.entity.ServiceRequest;

public interface ServiceRequestService {

    public List<ServiceRequest> searchByJobDescription(String jobDescription);

    public void createNewServiceRequest(ServiceRequest serviceRequest);
}
