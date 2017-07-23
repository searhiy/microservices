package com.example.microservices.doctor.service;

import com.example.microservices.doctor.domain.Doctor;
import com.example.microservices.doctor.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class FixtureService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Bean
    CommandLineRunner test() {
        return (args) -> {
            doctorRepository.save(new Doctor("Serhii"));
            doctorRepository.save(new Doctor("Yuriy"));
            doctorRepository.save(new Doctor("Igor"));
            doctorRepository.save(new Doctor("Vitalii"));

            System.out.println(doctorRepository.findAll());
        };
    }
}
