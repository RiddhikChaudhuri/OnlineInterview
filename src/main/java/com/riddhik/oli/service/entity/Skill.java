package com.riddhik.oli.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue
    @Column(name = "SKILL_ID")
    private Integer skillID;

    @Column(name = "SKILL_NAME")
    private String skillName;

    public Integer getSkillID() {
        return skillID;
    }

    public void setSkillID(Integer skillID) {
        this.skillID = skillID;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Skill(Integer skillID, String skillName) {
        super();
        this.skillID = skillID;
        this.skillName = skillName;
    }

    public Skill() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Skill(Integer skillID, String skillName, ServiceRequest serviceRequest) {
        super();
        this.skillID = skillID;
        this.skillName = skillName;
    }

}
