package com.oli.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CONTACT_DETAILS")
public class ContactDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recruitedId;
       
    @Column(name="RECRUITER_NAME")
    private String recruiterName;
    
    @Column(name="CONTACT_COMPANY")
    private String contactCompany;
    
    @Column(name="COMPANY_WEBSITE")
    private String companyWebsite;
    
    @Column(name="COMPANY_PHONE")
    private Integer companyPhoneNumber;
    
    @OneToOne
    @PrimaryKeyJoinColumn
    private ServiceRequest serviceRequest;

    public Integer getRecruitedId() {
        return recruitedId;
    }

    public void setRecruitedId(Integer recruitedId) {
        this.recruitedId = recruitedId;
    }

    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(ServiceRequest serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    public String getRecruiterName() {
        return recruiterName;
    }

    public void setRecruiterName(String recruiterName) {
        this.recruiterName = recruiterName;
    }

    public String getContactCompany() {
        return contactCompany;
    }

    public void setContactCompany(String contactCompany) {
        this.contactCompany = contactCompany;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public Integer getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(Integer companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public ContactDetails(String recruiterName, String contactCompany, String companyWebsite, Integer companyPhoneNumber) {
        super();
        this.recruiterName = recruiterName;
        this.contactCompany = contactCompany;
        this.companyWebsite = companyWebsite;
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public ContactDetails() {
        super();
    }

}
