package com.riddhik.oli.service.domain;

public class Skill {

    private String skillName;

    public Skill() {
	super();
    }

    public Skill(String skillName) {
	super();
	this.skillName = skillName;
    }

    public String getSkillName() {
	return skillName;
    }

    public void setSkillName(String skillName) {
	this.skillName = skillName;
    }

    @Override
    public String toString() {
	return "Skill [skillName=" + skillName + "]";
    }

}
