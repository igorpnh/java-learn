package org.example.domain.fee;

import org.example.interfaces.FeeStrategy;

public class SavingsFeeStrategy implements FeeStrategy {
    public double calculate(double amount) {
        return 0;
    }
}
