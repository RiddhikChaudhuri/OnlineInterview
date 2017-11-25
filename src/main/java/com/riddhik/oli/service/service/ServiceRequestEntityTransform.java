package com.riddhik.oli.service.service;

import com.riddhik.oli.service.domain.ServiceRequest;
import com.riddhik.oli.service.entity.ServiceRequestEntity;

public interface ServiceRequestEntityTransform {

    public ServiceRequestEntity createServiceRequestEntity(ServiceRequest serviceRequest);
}
