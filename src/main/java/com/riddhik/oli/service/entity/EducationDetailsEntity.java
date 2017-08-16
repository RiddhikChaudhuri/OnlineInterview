package com.riddhik.oli.service.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EducationDetailsEntity {

    @Column(name = "UGREQUIREMENT")
    private Boolean ugRequirement;

    @Column(name = "PGREQUIREMENT")
    private Boolean pgRequirement;

    @Column(name = "DCREQUIREMENT")
    private Boolean doctrateRequirement;

    public EducationDetailsEntity() {
	super();
    }

    public EducationDetailsEntity(Boolean ugRequirement, Boolean pgRequirement, Boolean doctrateRequirement) {
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

    @Override
    public String toString() {
	return "EducationDetails [ugRequirement=" + ugRequirement + ", pgRequirement=" + pgRequirement
		+ ", doctrateRequirement=" + doctrateRequirement + ", getUgRequirement()=" + getUgRequirement()
		+ ", getPgRequirement()=" + getPgRequirement() + ", getDoctrateRequirement()="
		+ getDoctrateRequirement() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
		+ ", toString()=" + super.toString() + "]";
    }

}