package com.riddhik.oli.service.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "SERVICE_REQUEST")
public class ServiceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JOB_ID")
    private Integer jobID;

    @Column(name = "JOB_TITLE")
    private String jobTitle;

    @OneToMany(targetEntity = Skill.class, cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Skill> keySkills;

    @Column
    @Lob
    private String companyProfile;

    @Embedded
    private CandidateProfile desiredCandidateProfile;

    @Column(name = "JOB_DESCRIPTION")
    @Lob
    private String jobDescription;

    @OneToOne(targetEntity = ContactDetails.class, cascade = CascadeType.ALL)
    @JsonBackReference
    private ContactDetails contactDetails;

    public String getCompanyProfile() {
	return companyProfile;
    }

    public ContactDetails getContactDetails() {
	return this.contactDetails;
    }

    public CandidateProfile getDesiredCandidateProfile() {
	return desiredCandidateProfile;
    }

    public String getJobDescription() {
	return jobDescription;
    }

    public Integer getJobID() {
	return jobID;
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

    public void setDesiredCandidateProfile(CandidateProfile desiredCandidateProfile) {
	this.desiredCandidateProfile = desiredCandidateProfile;
    }

    public void setJobDescription(String jobDescription) {
	this.jobDescription = jobDescription;
    }

    public void setJobID(Integer jobID) {
	this.jobID = jobID;
    }

    public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
    }

    public void setKeySkills(List<Skill> keySkills) {
	this.keySkills = keySkills;
    }

    @Override
    public String toString() {
	return "ServiceRequest [jobID=" + jobID + ", jobTitle=" + jobTitle + ", keySkills=" + keySkills
		+ ", companyProfile=" + companyProfile + ", desiredCandidateProfile=" + desiredCandidateProfile
		+ ", jobDescription=" + jobDescription + ", contactDetails=" + contactDetails + ", getJobID()="
		+ getJobID() + ", getJobTitle()=" + getJobTitle() + ", getKeySkills()=" + getKeySkills()
		+ ", getCompanyProfile()=" + getCompanyProfile() + ", getDesiredCandidateProfile()="
		+ getDesiredCandidateProfile() + ", getJobDescription()=" + getJobDescription()
		+ ", getContactDetails()=" + getContactDetails() + ", getClass()=" + getClass() + ", hashCode()="
		+ hashCode() + ", toString()=" + super.toString() + "]";
    }

}
