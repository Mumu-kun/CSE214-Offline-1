package com.problem1.paymentTerminal;

public class OnSpotTerminal implements PaymentTerminal {
    @Override
    public String getType() {
        return "Payment Terminal : On Spot";
    }
}