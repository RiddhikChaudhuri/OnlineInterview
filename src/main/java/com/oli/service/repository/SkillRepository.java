package com.oli.service.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.oli.service.entity.Skill;

public interface SkillRepository extends CrudRepository<Skill, Integer> {

    public List<Skill> findBySkillID(Integer ID);
}
