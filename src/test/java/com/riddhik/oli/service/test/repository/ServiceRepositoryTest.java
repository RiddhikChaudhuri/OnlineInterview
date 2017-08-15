package com.riddhik.oli.service.test.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.riddhik.oli.service.OnlineApplication;
import com.riddhik.oli.service.entity.ServiceRequestEntity;
import com.riddhik.oli.service.repository.ServiceRequestRepository;
import com.riddhik.oli.service.serviceImpl.ServiceRequestServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@ContextConfiguration(classes = { OnlineApplication.class, ServiceRequestServiceImpl.class })
@Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:beforeTestRun.sql")
public class ServiceRepositoryTest {

    /*
     * Use the @Sql statement only if you want to run the query specific to a
     * particular class.
     */
    @Autowired
    private ServiceRequestRepository serviceRepository;

    @Test
    public void whenFindByJobDescription() {
	List<ServiceRequestEntity> serviceRequestfound = this.serviceRepository.findByJobDescription("IT Engineer");
        assertEquals(serviceRequestfound.size(), 1);
    }

}
