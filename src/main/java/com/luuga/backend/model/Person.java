package com.luuga.backend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import static javax.persistence.GenerationType.SEQUENCE;


@Data
@MappedSuperclass
public class Person extends Address {
    private String firstName;
    private String lastName;
}
