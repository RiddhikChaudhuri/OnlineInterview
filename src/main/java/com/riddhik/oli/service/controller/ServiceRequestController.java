package com.riddhik.oli.service.controller;

import java.util.Date;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riddhik.oli.service.domain.ServiceRequest;
import com.riddhik.oli.service.service.ServiceRequestService;

@RestController
@RequestMapping("/servicerequest")
public class ServiceRequestController {

	private static final Logger logger = LoggerFactory.getLogger(ServiceRequestController.class);

	@Autowired
	ServiceRequestService serviceRequestService;

	@RequestMapping(value = "/createNewService", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	public HttpStatus createNewServiceRequest(@RequestBody ServiceRequest serviceRequest) {
		serviceRequest.setCreatedDate(new Date());
		serviceRequestService.createNewServiceRequest(serviceRequest);
		return HttpStatus.CREATED;
	}

	@RequestMapping(value = "/listAllservice", method = RequestMethod.GET)
	public ResponseEntity<List<ServiceRequest>> listAllServiceRequestBy(
			@RequestParam("jobDescription") String jobDescription) {
		logger.info("Entering into ListAll Jobs by Description method");
		List<ServiceRequest> serviceRequests = serviceRequestService.searchByJobDescription(jobDescription);
		if (serviceRequests.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<ServiceRequest>>(serviceRequests, HttpStatus.OK);
	}

}
