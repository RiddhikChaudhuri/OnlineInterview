package com.riddhik.oli.service.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.OneToOne;

@Embeddable
public class CandidateProfileEntity {

    @Column
    private String position;

    @Column
    private Integer experience;

    @Column
    private String jobLocation;

    @Column
    private String costToCompany;

    @Column
    private Integer timeToJoin;

    @Column
    @Embedded
    private EducationDetailsEntity educationDeatils;

    public CandidateProfileEntity(String position, Integer experience, String jobLocation, String costToCompany,
            Integer timeToJoin, EducationDetailsEntity educationDeatils) {
        super();
        this.position = position;
        this.experience = experience;
        this.jobLocation = jobLocation;
        this.costToCompany = costToCompany;
        this.timeToJoin = timeToJoin;
        this.educationDeatils = educationDeatils;
    }

    public CandidateProfileEntity() {
        super();
    }

    public String getCostToCompany() {
        return costToCompany;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public EducationDetailsEntity getEducationDeatils() {
        return educationDeatils;
    }

    public Integer getExperience() {
        return experience;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public String getPosition() {
        return position;
    }

    public Integer getTimeToJoin() {
        return timeToJoin;
    }

    public void setCostToCompany(String costToCompany) {
        this.costToCompany = costToCompany;
    }

    public void setEducationDeatils(EducationDetailsEntity educationDeatils) {
        this.educationDeatils = educationDeatils;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTimeToJoin(Integer timeToJoin) {
        this.timeToJoin = timeToJoin;
    }

    @Override
    public String toString() {
        return "CandidateProfile [position=" + position + ", experience=" + experience + ",jobLocation=" + jobLocation
                + ", costToCompany=" + costToCompany + ", timeToJoin=" + timeToJoin + ", educationDeatils="
                + educationDeatils + ", getPosition()=" + getPosition() + ", getExperience()=" + getExperience()
                + ", getJobLocation()=" + getJobLocation() + ", getCostToCompany()=" + getCostToCompany()
                + ", getTimeToJoin()=" + getTimeToJoin() + ", getEducationDeatils()=" + getEducationDeatils()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

}
