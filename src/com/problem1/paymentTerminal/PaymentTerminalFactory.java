package com.problem1.paymentTerminal;

public class PaymentTerminalFactory {
    public PaymentTerminal getPaymentTerminal() {
        return new OnSpotTerminal();
    }
}
