package com.riddhik.oli.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "CONTACT_DETAILS")
public class ContactDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recruitedId;

    @Column(name = "RECRUITER_NAME")
    private String recruiterName;

    @Column(name = "CONTACT_COMPANY")
    private String contactCompany;

    @Column(name = "COMPANY_WEBSITE")
    private String companyWebsite;

    @Column(name = "COMPANY_PHONE")
    private Integer companyPhoneNumber;

    @OneToOne
    @PrimaryKeyJoinColumn
    @JsonManagedReference
    private ServiceRequest serviceRequest;

    public ContactDetails() {
	super();
    }

    public ContactDetails(String recruiterName, String contactCompany, String companyWebsite,
	    Integer companyPhoneNumber) {
	super();
	this.recruiterName = recruiterName;
	this.contactCompany = contactCompany;
	this.companyWebsite = companyWebsite;
	this.companyPhoneNumber = companyPhoneNumber;
    }

    public Integer getCompanyPhoneNumber() {
	return companyPhoneNumber;
    }

    public String getCompanyWebsite() {
	return companyWebsite;
    }

    public String getContactCompany() {
	return contactCompany;
    }

    public Integer getRecruitedId() {
	return recruitedId;
    }

    public String getRecruiterName() {
	return recruiterName;
    }

    public ServiceRequest getServiceRequest() {
	return serviceRequest;
    }

    public void setCompanyPhoneNumber(Integer companyPhoneNumber) {
	this.companyPhoneNumber = companyPhoneNumber;
    }

    public void setCompanyWebsite(String companyWebsite) {
	this.companyWebsite = companyWebsite;
    }

    public void setContactCompany(String contactCompany) {
	this.contactCompany = contactCompany;
    }

    public void setRecruitedId(Integer recruitedId) {
	this.recruitedId = recruitedId;
    }

    public void setRecruiterName(String recruiterName) {
	this.recruiterName = recruiterName;
    }

    public void setServiceRequest(ServiceRequest serviceRequest) {
	this.serviceRequest = serviceRequest;
    }

    @Override
    public String toString() {
	return "ContactDetails [recruitedId=" + recruitedId + ", recruiterName=" + recruiterName + ", contactCompany="
		+ contactCompany + ", companyWebsite=" + companyWebsite + ", companyPhoneNumber=" + companyPhoneNumber
		+ ", serviceRequest=" + serviceRequest + ", getRecruitedId()=" + getRecruitedId()
		+ ", getServiceRequest()=" + getServiceRequest() + ", getRecruiterName()=" + getRecruiterName()
		+ ", getContactCompany()=" + getContactCompany() + ", getCompanyWebsite()=" + getCompanyWebsite()
		+ ", getCompanyPhoneNumber()=" + getCompanyPhoneNumber() + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

}
