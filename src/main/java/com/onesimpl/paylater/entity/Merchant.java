package com.onesimpl.paylater.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Merchant {
    String merchantName;
    Double discountPercent;
    String email;
    Double totalAmount;
}
