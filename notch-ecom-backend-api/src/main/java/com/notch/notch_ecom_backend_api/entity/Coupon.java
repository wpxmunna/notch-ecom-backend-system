package com.notch.notch_ecom_backend_api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String couponCode;
    private double couponPriceOrPercentage;
    private LocalDateTime validityStartDate;
    private LocalDateTime validityEndDate;
    private double minimumOrderValue;
    private boolean isActive = true;
    @ManyToMany(mappedBy = "usedCoupons")
    private Set<User> usedByUser = new HashSet<>();

}
