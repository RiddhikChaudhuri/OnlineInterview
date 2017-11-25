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
import com.riddhik.oli.service.service.ServiceRequestEntityTransform;

@Service
public class ServiceRequestEntityTransformImpl implements ServiceRequestEntityTransform {

    private CandidateProfileEntity createCandidateProfileEntity(CandidateProfile candidateProfile) {
	CandidateProfileEntity candidateProfileEntity = new CandidateProfileEntity(candidateProfile.getPosition(),
		candidateProfile.getExperience(), candidateProfile.getJobLocation(), candidateProfile.getJobLocation(),
		candidateProfile.getTimeToJoin(), createEducationDetailsEntity(candidateProfile.getEducationDeatils()));
	return candidateProfileEntity;
    }

    private ContactDetailsEntity createContactDetailsEntity(ContactDetails contactDetails) {
	ContactDetailsEntity contactDetailsEntity = new ContactDetailsEntity(contactDetails.getRecruiterName(),
		contactDetails.getContactCompany(), contactDetails.getCompanyWebsite(),
		contactDetails.getCompanyPhoneNumber());
	return contactDetailsEntity;
    }

    private EducationDetailsEntity createEducationDetailsEntity(EducationDetails educationDetails) {
	EducationDetailsEntity educationDetailsEntity = new EducationDetailsEntity(educationDetails.getUgRequirement(),
		educationDetails.getPgRequirement(), educationDetails.getDoctrateRequirement());

	return educationDetailsEntity;
    }

    private List<SkillEntity> createListSkillEntity(List<Skill> skills) {
	List<SkillEntity> skillEntityList = new ArrayList<>();
	for (Skill skill : skills)
	    skillEntityList.add(createSkillEntity(skill));

	return skillEntityList;
    }

    @Override
    public ServiceRequestEntity createServiceRequestEntity(ServiceRequest serviceRequest) {
	ServiceRequestEntity serviceRequestEntity = new ServiceRequestEntity(serviceRequest.getCompanyProfile(),
		serviceRequest.getCreatedDate(), serviceRequest.getJobDescription(), serviceRequest.getJobTitle(),
		createListSkillEntity(serviceRequest.getKeySkills()),
		createCandidateProfileEntity(serviceRequest.getDesiredCandidateProfile()),
		createContactDetailsEntity(serviceRequest.getContactDetails()));

	return serviceRequestEntity;

    }

    private SkillEntity createSkillEntity(Skill skill) {
	SkillEntity skillEntity = new SkillEntity(skill.getSkillName());
	return skillEntity;
    }

}
