package com.oli.service.entity;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getCostToCompany() {
        return costToCompany;
    }

    public void setCostToCompany(String costToCompany) {
        this.costToCompany = costToCompany;
    }

    public Integer getTimeToJoin() {
        return timeToJoin;
    }

    public void setTimeToJoin(Integer timeToJoin) {
        this.timeToJoin = timeToJoin;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public EducationDetails getEducationDeatils() {
        return educationDeatils;
    }

    public void setEducationDeatils(EducationDetails educationDeatils) {
        this.educationDeatils = educationDeatils;
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

    public CandidateProfile() {
        super();
    }

}
