package com.lambdaschool;

public class PiggyBank {

    private double balance;

    public void add(UsCurrency deposit) {
        balance = balance + (deposit.getCount() * deposit.getParValue());
    }
}
