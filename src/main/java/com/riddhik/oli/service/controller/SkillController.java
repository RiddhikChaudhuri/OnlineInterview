package com.riddhik.oli.service.controller;

import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.riddhik.oli.service.domain.Skill;
import com.riddhik.oli.service.service.SkillService;

@RestController
@RequestMapping(value="/skill")
public class SkillController {
	
	private static final Logger logger = LoggerFactory.getLogger(SkillController.class);
	
	@Autowired
	private SkillService skillService;
	
	@RequestMapping(value = "/addNewSkill", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	public HttpStatus addNewSkill(@RequestBody Skill skill) {
		skillService.addNewSkill(skill);
		return HttpStatus.CREATED;
		
	}
}
