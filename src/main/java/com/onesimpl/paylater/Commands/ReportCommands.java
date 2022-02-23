package com.onesimpl.paylater.Commands;

import com.onesimpl.paylater.delegator.PaymentDelegate;


public enum ReportCommands implements Commands {

    USERS_AT_CREDIT_LIMIT {
        @Override
        public void executeCommand(String[] inputValues, PaymentDelegate paymentDelegate) {
            paymentDelegate.reportUsersAtCreditLimit();
        }
    },
    DISCOUNT {
        @Override
        public void executeCommand(String[] inputValues, PaymentDelegate paymentDelegate) {
            paymentDelegate.reportDiscount(inputValues[2]);
        }
    },
    TOTAL_DUES {
        @Override
        public void executeCommand(String[] inputValues, PaymentDelegate paymentDelegate) {
            paymentDelegate.reportTotalDues();
        }
    },
    DUES {
        @Override
        public void executeCommand(String[] inputValues, PaymentDelegate paymentDelegate) {
            paymentDelegate.reportDues(inputValues[2]);
        }
    }

}