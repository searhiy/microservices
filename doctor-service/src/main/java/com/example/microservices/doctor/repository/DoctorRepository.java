package com.example.microservices.doctor.repository;

import com.example.microservices.doctor.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findByFirstName(@Param("firstName") String firstName);

}
