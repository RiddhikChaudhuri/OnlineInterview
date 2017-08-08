/**
 * 
 */
package com.oli.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.oli.service.entity.ContactDetails;

/**
 * @author Sam-Riddhik
 *
 */
public interface ContactDetailsRepository extends CrudRepository<ContactDetails, Integer> {

}
