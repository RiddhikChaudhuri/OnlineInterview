package com.riddhik.oli.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.validation.annotation.Validated;

import com.riddhik.oli.service.entity.ContactDetailsEntity;

@Validated
public interface ContactDetailsRepository extends CrudRepository<ContactDetailsEntity, Integer> {

}
