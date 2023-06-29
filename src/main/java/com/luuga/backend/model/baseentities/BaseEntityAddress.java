package com.luuga.backend.model.baseentities;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;

@Embeddable
@Data
@EntityListeners(AuditingEntityListener.class)
public class BaseEntityAddress {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String gpsCoordinates;
}
