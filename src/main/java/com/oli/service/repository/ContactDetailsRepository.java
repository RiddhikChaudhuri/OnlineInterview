package com.oli.service.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.oli.service.entity.ContactDetails;

/**
 * @author Sam-Riddhik
 *
 */
public interface ContactDetailsRepository extends CrudRepository<ContactDetails, Integer> {

    public List<ContactDetails> findByRecruitedId(Integer ID);
}
