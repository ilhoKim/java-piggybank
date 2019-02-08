package com.lambdaschool;

import java.util.ArrayList;

public class PiggyBank {

    private ArrayList<UsCurrency> account = new ArrayList<>();
    private double balance;

    public void add(UsCurrency deposit) {
        balance = balance + (deposit.getCount() * deposit.getParValue());
        account.add(deposit);
    }

    public double getBalance() {
        return balance;
    }

    public void inquiryAccount() {
        for (UsCurrency c: account) {
            System.out.println(c.getCount() + " " + c.getCommonName());
        }
    }
}
