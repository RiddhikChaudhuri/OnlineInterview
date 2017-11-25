package com.riddhik.oli.service.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

public class ServiceRequest {

    private String jobTitle;

    private List<Skill> keySkills;

    private String companyProfile;

    private CandidateProfile desiredCandidateProfile;

    private String jobDescription;

    private ContactDetails contactDetails;

    private Date createdDate;

    public ServiceRequest() {
	super();
    }

    public ServiceRequest(String jobTitle, List<Skill> keySkills, String companyProfile,
	    CandidateProfile desiredCandidateProfile, String jobDescription, ContactDetails contactDetails,
	    Date createdDate) {
	super();
	this.jobTitle = jobTitle;
	this.keySkills = keySkills;
	this.companyProfile = companyProfile;
	this.desiredCandidateProfile = desiredCandidateProfile;
	this.jobDescription = jobDescription;
	this.contactDetails = contactDetails;
	this.createdDate = createdDate;
    }

    public String getCompanyProfile() {
	return companyProfile;
    }

    public ContactDetails getContactDetails() {
	return this.contactDetails;
    }

    @JsonSerialize(using = DateSerializer.class)
    public Date getCreatedDate() {
	return createdDate;
    }

    public CandidateProfile getDesiredCandidateProfile() {
	return desiredCandidateProfile;
    }

    public String getJobDescription() {
	return jobDescription;
    }

    public String getJobTitle() {
	return jobTitle;
    }

    public List<Skill> getKeySkills() {
	return keySkills;
    }

    public void setCompanyProfile(String companyProfile) {
	this.companyProfile = companyProfile;
    }

    public void setContactDetails(ContactDetails contactDetails) {
	this.contactDetails = contactDetails;
    }

    public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
    }

    public void setDesiredCandidateProfile(CandidateProfile desiredCandidateProfile) {
	this.desiredCandidateProfile = desiredCandidateProfile;
    }

    public void setJobDescription(String jobDescription) {
	this.jobDescription = jobDescription;
    }

    public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
    }

    public void setKeySkills(List<Skill> keySkills) {
	this.keySkills = keySkills;
    }

    @Override
    public String toString() {
	return "ServiceRequest [jobTitle=" + jobTitle + ", keySkills=" + keySkills + ", companyProfile="
		+ companyProfile + ", desiredCandidateProfile=" + desiredCandidateProfile + ", jobDescription="
		+ jobDescription + ", contactDetails=" + contactDetails + ", createdDate=" + createdDate + "]";
    }

}
