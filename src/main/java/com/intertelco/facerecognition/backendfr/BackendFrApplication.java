package com.intertelco.facerecognition.backendfr;

import com.intertelco.facerecognition.backendfr.jpa.Role;
import com.intertelco.facerecognition.backendfr.jpa.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendFrApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendFrApplication.class, args);
	}


	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void run(String... args) throws Exception {

		roleRepository.save(new Role("ADMIN", "ADMINISTRATOR"));
		roleRepository.save(new Role("USER", "USERS"));
		roleRepository.save(new Role("GUEST", "GUESTS"));
		roleRepository.save(new Role("OTHER", "OTHERS"));
	}
}
