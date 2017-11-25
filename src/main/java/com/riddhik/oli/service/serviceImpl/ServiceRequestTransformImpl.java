package com.riddhik.oli.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.riddhik.oli.service.domain.CandidateProfile;
import com.riddhik.oli.service.domain.ContactDetails;
import com.riddhik.oli.service.domain.EducationDetails;
import com.riddhik.oli.service.domain.ServiceRequest;
import com.riddhik.oli.service.domain.Skill;
import com.riddhik.oli.service.entity.CandidateProfileEntity;
import com.riddhik.oli.service.entity.ContactDetailsEntity;
import com.riddhik.oli.service.entity.EducationDetailsEntity;
import com.riddhik.oli.service.entity.ServiceRequestEntity;
import com.riddhik.oli.service.entity.SkillEntity;
import com.riddhik.oli.service.service.ServiceRequestTransform;

@Service
public class ServiceRequestTransformImpl implements ServiceRequestTransform {

    private CandidateProfile createCandidateProfile(CandidateProfileEntity candidateProfileEntity) {
	CandidateProfile candidateProfile = new CandidateProfile(candidateProfileEntity.getPosition(),
		candidateProfileEntity.getExperience(), candidateProfileEntity.getJobLocation(),
		candidateProfileEntity.getCostToCompany(), candidateProfileEntity.getTimeToJoin(),
		createEducationDetails(candidateProfileEntity.getEducationDeatils()));
	return candidateProfile;
    }

    private ContactDetails createContactDetails(ContactDetailsEntity contactDetailsEntity) {
	ContactDetails contactDetails = new ContactDetails(contactDetailsEntity.getRecruiterName(),
		contactDetailsEntity.getContactCompany(), contactDetailsEntity.getCompanyWebsite(),
		contactDetailsEntity.getCompanyPhoneNumber());
	return contactDetails;
    }

    private EducationDetails createEducationDetails(EducationDetailsEntity educationDetailsEntity) {
	EducationDetails educationDetails = new EducationDetails(educationDetailsEntity.getUgRequirement(),
		educationDetailsEntity.getPgRequirement(), educationDetailsEntity.getDoctrateRequirement());

	return educationDetails;
    }

    private List<Skill> createListSkill(List<SkillEntity> skillsEntity) {
	List<Skill> skillList = new ArrayList<>();
	for (SkillEntity skillEntity : skillsEntity)
	    skillList.add(createSkill(skillEntity));

	return skillList;
    }

    @Override
    public ServiceRequest createServiceRequest(ServiceRequestEntity serviceRequestEntity) {
	ServiceRequest serviceRequest = new ServiceRequest(serviceRequestEntity.getJobTitle(),
		createListSkill(serviceRequestEntity.getKeySkills()), serviceRequestEntity.getCompanyProfile(),
		createCandidateProfile(serviceRequestEntity.getDesiredCandidateProfile()),
		serviceRequestEntity.getJobDescription(),
		createContactDetails(serviceRequestEntity.getContactDetails()), serviceRequestEntity.getCreatedDate());

	return serviceRequest;

    }

    private Skill createSkill(SkillEntity skillEntity) {
	Skill skill = new Skill(skillEntity.getSkillName());
	return skill;
    }
}
