package com.riddhik.oli.service.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Embeddable
public class CandidateProfile {

    @Column
    private String position;

    @Column
    private Integer experience;

    @Column
    @OneToMany(mappedBy = "skillID", targetEntity = Skill.class)
    private List<Skill> skills;

    @Column
    private String jobLocation;

    @Column
    private String costToCompany;

    @Column
    private Integer timeToJoin;

    @Column
    @Embedded
    private EducationDetails educationDeatils;

    public CandidateProfile() {
	super();
    }

    public CandidateProfile(String position, Integer experience, List<Skill> skills, String jobLocation,
	    String costToCompany, Integer timeToJoin, EducationDetails educationDeatils) {
	super();
	this.position = position;
	this.experience = experience;
	this.skills = skills;
	this.jobLocation = jobLocation;
	this.costToCompany = costToCompany;
	this.timeToJoin = timeToJoin;
	this.educationDeatils = educationDeatils;
    }

    public String getCostToCompany() {
	return costToCompany;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public EducationDetails getEducationDeatils() {
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

    public List<Skill> getSkills() {
	return skills;
    }

    public Integer getTimeToJoin() {
	return timeToJoin;
    }

    public void setCostToCompany(String costToCompany) {
	this.costToCompany = costToCompany;
    }

    public void setEducationDeatils(EducationDetails educationDeatils) {
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

    public void setSkills(List<Skill> skills) {
	this.skills = skills;
    }

    public void setTimeToJoin(Integer timeToJoin) {
	this.timeToJoin = timeToJoin;
    }

    @Override
    public String toString() {
	return "CandidateProfile [position=" + position + ", experience=" + experience + ", skills=" + skills
		+ ", jobLocation=" + jobLocation + ", costToCompany=" + costToCompany + ", timeToJoin=" + timeToJoin
		+ ", educationDeatils=" + educationDeatils + ", getPosition()=" + getPosition() + ", getExperience()="
		+ getExperience() + ", getSkills()=" + getSkills() + ", getJobLocation()=" + getJobLocation()
		+ ", getCostToCompany()=" + getCostToCompany() + ", getTimeToJoin()=" + getTimeToJoin()
		+ ", getEducationDeatils()=" + getEducationDeatils() + ", getClass()=" + getClass() + ", hashCode()="
		+ hashCode() + ", toString()=" + super.toString() + "]";
    }

}
