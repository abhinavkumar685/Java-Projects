package com.onesimpl.paylater.Commands;

import com.onesimpl.paylater.delegator.PaymentDelegate;

public enum UpdateCommands implements Commands {

    MERCHANT {
        @Override
        public void executeCommand(String[] inputValues, PaymentDelegate paymentDelegate) {
            paymentDelegate.updateMerchant(inputValues[2],inputValues[3].replace("%",""));
        }
    }
}
