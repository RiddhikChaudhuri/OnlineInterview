package com.riddhik.oli.service.service;

import com.riddhik.oli.service.domain.ServiceRequest;
import com.riddhik.oli.service.entity.ServiceRequestEntity;

public interface ServiceRequestTransform {

    public ServiceRequest createServiceRequest(ServiceRequestEntity serviceRequestEntity);
}
