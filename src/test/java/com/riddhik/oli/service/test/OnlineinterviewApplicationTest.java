package com.riddhik.oli.service.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.riddhik.oli.service.repository.ServiceRequestRepository;
import com.riddhik.oli.service.service.ServiceRequestService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ServiceRequestRepository.class)
public class OnlineinterviewApplicationTest {

    @Autowired
    ServiceRequestService serviceRequestService;
}
