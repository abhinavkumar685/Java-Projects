package com.onesimpl.paylater.Commands;

import com.onesimpl.paylater.delegator.PaymentDelegate;

public interface Commands {
    void executeCommand(String[] inputValues, PaymentDelegate paymentDelegate);
}
