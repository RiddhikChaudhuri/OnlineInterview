package com.oli.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.oli.service.entity.CandidateProfile;
import com.oli.service.entity.ContactDetails;
import com.oli.service.entity.EducationDetails;
import com.oli.service.entity.ServiceRequest;
import com.oli.service.entity.Skill;
import com.oli.service.repository.ServiceRequestRepository;

@SpringBootApplication
@EntityScan(basePackages = { "com.oli.service.entity" })
@EnableJpaRepositories("com.oli.service.repository")
public class OnlineApplication implements CommandLineRunner {

    @Autowired
    ServiceRequestRepository applicationRepository;

    public static void main(String[] args) {
        SpringApplication.run(OnlineApplication.class, args);

    }

    @Override
    public void run(String... arg0) throws Exception {
        ServiceRequest service = new ServiceRequest();

        service.setCompanyProfile("Mindtree");
        List<Skill> skillList = new ArrayList<>();
        Skill skill = new Skill();

        skill.setSkillName("Java");
        service.setJobTitle("Full Time");
        skillList.add(skill);
        service.setJobDescription("IT Engineer");
        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setCompanyPhoneNumber(1258749);
        contactDetails.setCompanyWebsite("http://www.demo.com");
        contactDetails.setContactCompany("Mindtree");
        contactDetails.setRecruiterName("Mindtree");
        contactDetails.setServiceRequest(service);
        service.setContactDetails(contactDetails);
        CandidateProfile desiredCandidateProfile = new CandidateProfile();
        EducationDetails educationDetails = new EducationDetails();
        educationDetails.setDoctrateRequirement(true);
        educationDetails.setPgRequirement(false);
        educationDetails.setUgRequirement(true);
        desiredCandidateProfile.setCostToCompany("150000");
        desiredCandidateProfile.setEducationDeatils(educationDetails);
        desiredCandidateProfile.setExperience(2);
        desiredCandidateProfile.setJobLocation("Bangalore");
        desiredCandidateProfile.setPosition("Engineer");
        desiredCandidateProfile.setSkills(skillList);
        desiredCandidateProfile.setTimeToJoin(1);
        service.setDesiredCandidateProfile(desiredCandidateProfile);

        service.setKeySkills(skillList);
        applicationRepository.save(service);
        
        ServiceRequest serviceSearch = applicationRepository.findOne(1);
        System.out.println("Please print the Service Search Details :-"+serviceSearch.getCompanyProfile()+" "+serviceSearch.getJobTitle());
        ServiceRequest serviceSearchByLocation = applicationRepository.findByJobDescription("IT Engineer");
        System.out.println("Please print the Service Search Details :-"+serviceSearchByLocation.getCompanyProfile()+" "+serviceSearchByLocation.getJobTitle());
    }

}
