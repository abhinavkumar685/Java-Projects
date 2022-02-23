package com.onesimpl.paylater.Commands;

import com.onesimpl.paylater.delegator.PaymentDelegate;

public enum PayBackCommands implements Commands {

    PAYBACK {
        @Override
        public void executeCommand(String[] inputValues, PaymentDelegate paymentDelegate) {
            paymentDelegate.payBack(inputValues[1],Double.valueOf(inputValues[2]));
        }
    }
}
