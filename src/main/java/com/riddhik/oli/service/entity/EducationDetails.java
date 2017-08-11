package com.riddhik.oli.service.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EducationDetails {

    @Column(name = "UGREQUIREMENT")
    private Boolean ugRequirement;

    @Column(name = "PGREQUIREMENT")
    private Boolean pgRequirement;

    @Column(name = "DCREQUIREMENT")
    private Boolean doctrateRequirement;

    public Boolean getUgRequirement() {
        return ugRequirement;
    }

    public void setUgRequirement(Boolean ugRequirement) {
        this.ugRequirement = ugRequirement;
    }

    public Boolean getPgRequirement() {
        return pgRequirement;
    }

    public void setPgRequirement(Boolean pgRequirement) {
        this.pgRequirement = pgRequirement;
    }

    public Boolean getDoctrateRequirement() {
        return doctrateRequirement;
    }

    public void setDoctrateRequirement(Boolean doctrateRequirement) {
        this.doctrateRequirement = doctrateRequirement;
    }

    public EducationDetails() {
        super();
    }

    public EducationDetails(Boolean ugRequirement, Boolean pgRequirement, Boolean doctrateRequirement) {
        super();
        this.ugRequirement = ugRequirement;
        this.pgRequirement = pgRequirement;
        this.doctrateRequirement = doctrateRequirement;
    }

}