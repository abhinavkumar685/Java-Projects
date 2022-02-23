package com.onesimpl.paylater.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class User {
    String userName;
    String email;
    Double creditLimit;
    Double dues;
}
