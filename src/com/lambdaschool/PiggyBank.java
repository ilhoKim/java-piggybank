package com.lambdaschool;

public class PiggyBank {

    private double balance;

    public void add(UsCurrency deposit) {
        balance = balance + (deposit.count * deposit.parValue);
    }
}
