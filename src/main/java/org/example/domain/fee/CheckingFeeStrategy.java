package org.example.domain.fee;

import org.example.interfaces.FeeStrategy;

public class CheckingFeeStrategy implements FeeStrategy {
    public double calculate(double amount) {
        return amount * 0.02;
    }
}
