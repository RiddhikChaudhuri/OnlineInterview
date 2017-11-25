package com.riddhik.oli.service.domain;

public class ContactDetails {

    private String recruiterName;

    private String contactCompany;

    private String companyWebsite;

    private Integer companyPhoneNumber;

    public ContactDetails() {
        super();
    }

    public ContactDetails(String recruiterName, String contactCompany, String companyWebsite, Integer companyPhoneNumber) {
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

    public String getRecruiterName() {
        return recruiterName;
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

    public void setRecruiterName(String recruiterName) {
        this.recruiterName = recruiterName;
    }

    @Override
    public String toString() {
        return "ContactDetails [recruiterName=" + recruiterName + ", contactCompany=" + contactCompany
                + ", companyWebsite=" + companyWebsite + ", companyPhoneNumber=" + companyPhoneNumber
                + ", serviceRequest=" + "]";
    }

}
