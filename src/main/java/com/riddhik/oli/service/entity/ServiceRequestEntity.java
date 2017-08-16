package com.riddhik.oli.service.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

@Entity
@Table(name = "SERVICE_REQUEST")
public class ServiceRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SERVICE_REQUEST_ID")
    private Integer serviceRequestID;

    @Column(name = "JOB_TITLE")
    private String jobTitle;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "serviceRequestEntity", fetch = FetchType.EAGER)
    private List<SkillEntity> keySkills;

    @Column
    @Lob
    private String companyProfile;

    @Embedded
    private CandidateProfileEntity desiredCandidateProfile;

    @Column(name = "JOB_DESCRIPTION")
    @Lob
    private String jobDescription;

    @OneToOne(targetEntity = ContactDetailsEntity.class, cascade = CascadeType.ALL)
    private ContactDetailsEntity contactDetails;

    private Date createdDate;

    public ServiceRequestEntity() {
	super();
	// TODO Auto-generated constructor stub
    }

    public ServiceRequestEntity(String companyProfile, Date createdDate, String jobDescription, String jobTitle,
	    List<SkillEntity> keySkills, CandidateProfileEntity desiredCandidateProfile,
	    ContactDetailsEntity contactDetails) {

	super();
	this.jobTitle = jobTitle;
	this.companyProfile = companyProfile;
	this.jobDescription = jobDescription;
	this.keySkills = keySkills;
	this.createdDate = createdDate;
	this.desiredCandidateProfile = desiredCandidateProfile;
	this.contactDetails = contactDetails;
    }

    public String getCompanyProfile() {
	return companyProfile;
    }

    public ContactDetailsEntity getContactDetails() {
	return this.contactDetails;
    }

    @JsonSerialize(using = DateSerializer.class)
    public Date getCreatedDate() {
	return createdDate;
    }

    public CandidateProfileEntity getDesiredCandidateProfile() {
	return desiredCandidateProfile;
    }

    public String getJobDescription() {
	return jobDescription;
    }

    public Integer getJobID() {
	return serviceRequestID;
    }

    public String getJobTitle() {
	return jobTitle;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "SERVICE_REQUEST_skill", joinColumns = {
	    @JoinColumn(name = "SERVICE_REQUEST_ID") }, inverseJoinColumns = { @JoinColumn(name = "SKILL_ID") })
    public List<SkillEntity> getKeySkills() {
	return keySkills;
    }

    public void setCompanyProfile(String companyProfile) {
	this.companyProfile = companyProfile;
    }

    public void setContactDetails(ContactDetailsEntity contactDetails) {
	this.contactDetails = contactDetails;
    }

    public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
    }

    public void setDesiredCandidateProfile(CandidateProfileEntity desiredCandidateProfile) {
	this.desiredCandidateProfile = desiredCandidateProfile;
    }

    public void setJobDescription(String jobDescription) {
	this.jobDescription = jobDescription;
    }

    public void setJobID(Integer jobID) {
	this.serviceRequestID = jobID;
    }

    public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
    }

    public void setKeySkills(List<SkillEntity> keySkills) {
	this.keySkills = keySkills;
    }

    @Override
    public String toString() {
	return "ServiceRequest [jobID=" + serviceRequestID + ", jobTitle=" + jobTitle + ", keySkills=" + keySkills
		+ ", companyProfile=" + companyProfile + ", desiredCandidateProfile=" + desiredCandidateProfile
		+ ", jobDescription=" + jobDescription + ", contactDetails=" + contactDetails + ", getJobID()="
		+ getJobID() + ", getJobTitle()=" + getJobTitle() + ", getKeySkills()=" + getKeySkills()
		+ ", getCompanyProfile()=" + getCompanyProfile() + ", getDesiredCandidateProfile()="
		+ getDesiredCandidateProfile() + ", getJobDescription()=" + getJobDescription()
		+ ", getContactDetails()=" + getContactDetails() + ", getClass()=" + getClass() + ", hashCode()="
		+ hashCode() + ", toString()=" + super.toString() + "]";
    }

}
