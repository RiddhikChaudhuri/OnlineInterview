package com.riddhik.oli.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "skill")
public class SkillEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SKILL_ID")
    private Integer skillID;

    @Column(name = "SKILL_NAME")
    private String skillName;

    @ManyToOne
    @JoinColumn(name = "serviceRequestID", nullable = false)
    @JsonManagedReference("skillDetails")
    private ServiceRequestEntity serviceRequestEntity;

    public SkillEntity() {
	super();
    }

    public SkillEntity(Integer skillID, String skillName) {
	super();
	this.skillID = skillID;
	this.skillName = skillName;
    }

    public SkillEntity(Integer skillID, String skillName, ServiceRequestEntity serviceRequest) {
	super();
	this.skillID = skillID;
	this.skillName = skillName;
    }

    public SkillEntity(String skillName) {
	this.skillName = skillName;
    }

    public ServiceRequestEntity getServiceRequestEntity() {
	return serviceRequestEntity;
    }

    public Integer getSkillID() {
	return skillID;
    }

    public String getSkillName() {
	return skillName;
    }

    public void setServiceRequestEntity(ServiceRequestEntity serviceRequestEntity) {
	this.serviceRequestEntity = serviceRequestEntity;
    }

    public void setSkillID(Integer skillID) {
	this.skillID = skillID;
    }

    public void setSkillName(String skillName) {
	this.skillName = skillName;
    }

    @Override
    public String toString() {
	return "Skill [skillID=" + skillID + ", skillName=" + skillName + ", getSkillID()=" + getSkillID()
		+ ", getSkillName()=" + getSkillName() + "]";
    }

}