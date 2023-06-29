package com.luuga.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@MappedSuperclass
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_countryId")
    private Country country;
    private String gpsCoordinates;
}
