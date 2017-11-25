package com.riddhik.oli.service.domain;

public class EducationDetails {

    @Override
    public String toString() {
        return "EducationDetails [ugRequirement=" + ugRequirement + ", pgRequirement=" + pgRequirement
                + ", doctrateRequirement=" + doctrateRequirement + "]";
    }

    private Boolean ugRequirement;

    private Boolean pgRequirement;

    private Boolean doctrateRequirement;

    public EducationDetails() {
        super();
    }

    public EducationDetails(Boolean ugRequirement, Boolean pgRequirement, Boolean doctrateRequirement) {
        super();
        this.ugRequirement = ugRequirement;
        this.pgRequirement = pgRequirement;
        this.doctrateRequirement = doctrateRequirement;
    }

    public Boolean getDoctrateRequirement() {
        return doctrateRequirement;
    }

    public Boolean getPgRequirement() {
        return pgRequirement;
    }

    public Boolean getUgRequirement() {
        return ugRequirement;
    }

    public void setDoctrateRequirement(Boolean doctrateRequirement) {
        this.doctrateRequirement = doctrateRequirement;
    }

    public void setPgRequirement(Boolean pgRequirement) {
        this.pgRequirement = pgRequirement;
    }

    public void setUgRequirement(Boolean ugRequirement) {
        this.ugRequirement = ugRequirement;
    }

}