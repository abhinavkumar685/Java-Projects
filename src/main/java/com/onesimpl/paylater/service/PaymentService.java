package com.onesimpl.paylater.service;

import com.onesimpl.paylater.entity.Merchant;
import com.onesimpl.paylater.entity.User;

import java.util.List;

public interface PaymentService {
    public User newUser(String userName, String email, Double creditLimit);

    public Merchant addMerchant(String merchantName, String email, Double discountPercent);

    public String newTransaction(String userName, String merchantName,Double transactionAmount);

    public String updateMerchant(String merchantName, Double newdiscountPercent);

    public User payBack(String userName, Double payBackAmount);

    public Double reportDiscount(String merchantName);

    public Double reportDues(String userName);

    public List<String> reportUsersAtCreditLimit();

    public List<User> reportTotalDues();
}
