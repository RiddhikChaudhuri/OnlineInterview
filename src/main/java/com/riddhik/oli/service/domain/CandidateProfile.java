package com.riddhik.oli.service.domain;

public class CandidateProfile {

    private String position;

    private Integer experience;

    private String jobLocation;

    private String costToCompany;

    private Integer timeToJoin;

    private EducationDetails educationDeatils;

    public CandidateProfile() {
	super();
    }

    public CandidateProfile(String position, Integer experience, String jobLocation, String costToCompany,
	    Integer timeToJoin, EducationDetails educationDeatils) {
	super();
	this.position = position;
	this.experience = experience;
	this.jobLocation = jobLocation;
	this.costToCompany = costToCompany;
	this.timeToJoin = timeToJoin;
	this.educationDeatils = educationDeatils;
    }

    public String getCostToCompany() {
	return costToCompany;
    }

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

    public void setTimeToJoin(Integer timeToJoin) {
	this.timeToJoin = timeToJoin;
    }

}
