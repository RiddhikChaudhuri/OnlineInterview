package com.riddhik.oli.service.serviceImpl;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riddhik.oli.service.domain.Skill;
import com.riddhik.oli.service.entity.SkillEntity;
import com.riddhik.oli.service.repository.SkillRepository;
import com.riddhik.oli.service.service.SkillService;
import com.riddhik.oli.util.SkillDuplicateException;

@Service("skillService")
public class SkillServiceImpl implements SkillService {
	
	private static final Logger logger = LoggerFactory.getLogger(SkillServiceImpl.class);

	@Autowired
	private SkillRepository skillRepository;

	@Override
	public void addNewSkill(Skill skill) {
		
		SkillEntity skillEntity = new SkillEntity(skill.getSkillName());
		if(!findDuplicateSkillSet(skillEntity)) {
		skillRepository.save(skillEntity);
		}else {
			logger.debug("Skill Set Duplicate");
			throw new SkillDuplicateException("Skill String Already Present in DataBase");
		}
		
	}

		
	private boolean findDuplicateSkillSet(SkillEntity skill) {
		ArrayList<SkillEntity> skillEntityListPresent = skillRepository.findBySkillName(skill.getSkillName());
		
		boolean checkString = false;
		
		for(SkillEntity skillSearch : skillEntityListPresent) {
			String skillString = skill.getSkillName();
			if(skillString.equalsIgnoreCase(skillSearch.getSkillName())){
				checkString = true;
			}
		}
		
		return checkString;
	}
}
