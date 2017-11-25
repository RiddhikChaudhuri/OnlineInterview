package com.riddhik.oli.service.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.apache.commons.lang.builder.HashCodeBuilder;

@Entity
@Table(name = "CONTACT_DETAILS")
public class ContactDetailsEntity implements Serializable {

    private static final long serialVersionUID = 1093797265729267583L;

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
    private ServiceRequestEntity serviceRequest;

    public ContactDetailsEntity() {
	super();
    }

    public ContactDetailsEntity(Integer recruitedId, String recruiterName, String contactCompany, String companyWebsite,
	    Integer companyPhoneNumber, ServiceRequestEntity serviceRequest) {
	super();
	this.recruitedId = recruitedId;
	this.recruiterName = recruiterName;
	this.contactCompany = contactCompany;
	this.companyWebsite = companyWebsite;
	this.companyPhoneNumber = companyPhoneNumber;
	this.serviceRequest = serviceRequest;
    }

    public ContactDetailsEntity(String recruiterName, String contactCompany, String companyWebsite,
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

    public ServiceRequestEntity getServiceRequest() {
	return serviceRequest;
    }

    @Override
    public int hashCode() {
	return new HashCodeBuilder(11, 31).append(super.hashCode()).append(recruitedId).append(recruiterName)
		.append(serviceRequest).append(companyPhoneNumber).append(contactCompany).toHashCode();
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

    public void setServiceRequest(ServiceRequestEntity serviceRequest) {
	this.serviceRequest = serviceRequest;
    }

}
