package com.onesimpl.paylater.controller;

import com.onesimpl.paylater.Commands.PayBackCommands;
import com.onesimpl.paylater.Commands.ReportCommands;
import com.onesimpl.paylater.Commands.UpdateCommands;
import com.onesimpl.paylater.delegator.PaymentDelegate;
import com.onesimpl.paylater.delegator.PaymentDelegateImpl;
import com.onesimpl.paylater.Commands.CreateCommands;


public class OutputGenerator {
    static PaymentDelegate paymentDelegate = new PaymentDelegateImpl();

    public static void generate(String inputCommand) {
        String[] inputs = inputCommand.split(" ");

        if(inputs[0].equals("new"))
            CreateCommands.valueOf(inputs[1].toUpperCase()).
                    executeCommand(inputs, paymentDelegate);

        if(inputs[0].equals("report"))
            ReportCommands.valueOf(inputs[1].toUpperCase().
                    replace("-","_")).executeCommand(inputs, paymentDelegate);

        if(inputs[0].equals("update"))
            UpdateCommands.valueOf(inputs[1].toUpperCase()).
                    executeCommand(inputs, paymentDelegate);

        if(inputs[0].equals("payback"))
            PayBackCommands.valueOf(inputs[0].toUpperCase().
                    replace("-","_")).executeCommand(inputs, paymentDelegate);
    }
}
