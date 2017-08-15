package com.riddhik.oli.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.riddhik.oli.service.entity" })
@EnableJpaRepositories("com.riddhik.oli.service.repository")
public class OnlineApplication implements CommandLineRunner {

    public static void main(String[] args) {
	SpringApplication.run(OnlineApplication.class, args);

    }

    @Override
    public void run(String... arg0) throws Exception {
    }

}
