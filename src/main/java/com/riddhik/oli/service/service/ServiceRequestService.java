package com.riddhik.oli.service.service;

import java.util.ArrayList;

import com.riddhik.oli.service.domain.ServiceRequest;
import com.riddhik.oli.service.entity.ServiceRequestEntity;

public interface ServiceRequestService {

    public ArrayList<ServiceRequestEntity> searchByJobDescription(String jobDescription);

    public void createNewServiceRequest(ServiceRequest serviceRequest);

}
