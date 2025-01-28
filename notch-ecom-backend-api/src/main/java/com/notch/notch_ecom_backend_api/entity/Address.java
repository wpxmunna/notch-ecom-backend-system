package com.notch.notch_ecom_backend_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address1;
    private String address2;
    private String address3;
    private String cityName;
    private String stateName;
    private String countryName;
    private String postalCode;
    private String phoneNumber;
}
