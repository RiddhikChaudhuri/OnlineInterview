package com.riddhik.oli.service.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.riddhik.oli.service.service.ServiceRequestService;

@RestController
public class HealthCheckController {

    @Autowired
    ServiceRequestService serviceRequestService;

    @RequestMapping(value = "/healthCheck", produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET)
    public HttpStatus returnResponse() {
	return HttpStatus.OK;

    }

}
