package com.notch.notch_ecom_backend_api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.notch.notch_ecom_backend_api.domain.USER_ROLE;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String email;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private USER_ROLE role = USER_ROLE.ROLE_ADMIN;
    @OneToMany
    private Set<Address> addresses = new HashSet<>();
    @ManyToMany
    @JsonIgnore
    private Set<Coupon> usedCoupons = new HashSet<>();
}
