package com.example.microservices.doctor.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "doctor_list")
@Data
@NoArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "doctor_id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;

    public Doctor(String firstName) {
        this.firstName = firstName;
    }
}
