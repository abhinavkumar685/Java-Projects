package com.onesimpl.paylater.Commands;

import com.onesimpl.paylater.delegator.PaymentDelegate;


public enum CreateCommands implements Commands {

    USER {
        @Override
        public void executeCommand(String[] inputValues, PaymentDelegate paymentDelegate) {
            paymentDelegate.newUser(inputValues[2], inputValues[3], Double.valueOf(inputValues[4]));
        }
    },
    MERCHANT {
        @Override
        public void executeCommand(String[] inputValues, PaymentDelegate paymentDelegate) {
            paymentDelegate.addMerchant(inputValues[2],
                    inputValues[3], Double.valueOf(inputValues[4].replace("%","")));
        }
    },
    TXN {
        @Override
        public void executeCommand(String[] inputValues, PaymentDelegate paymentDelegate) {
            paymentDelegate.newTransaction(inputValues[2], inputValues[3], Double.valueOf(inputValues[4]));
        }
    }
}
