package com.yaya.fatima;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yaya.fatima.Dao.PatientRepository;
import com.yaya.fatima.entities.Patient;

@SpringBootApplication
public class MvcPracticeApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(MvcPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patient(null,"Fatima Ezzahra",new Date(),false,3 ));	
		patientRepository.save(new Patient(null,"Zineb ",new Date(),false,5 ));		
		patientRepository.save(new Patient(null,"John",new Date(),true,6 ));	

		patientRepository.findAll().forEach(p->{
			System.out.println(p.getName());
		});

	}

	
	

}
