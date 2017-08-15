/**
 *
 */
package com.riddhik.oli.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.riddhik.oli.service.entity.ServiceRequestEntity;
import com.riddhik.oli.service.entity.SkillEntity;

/**
 * @author M1034198
 *
 */
public interface SkillRepository extends CrudRepository<SkillEntity, Integer> {

    public SkillEntity findByServiceRequestEntity(ServiceRequestEntity serviceRequestID);
}
