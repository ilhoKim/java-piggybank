package com.lambdaschool;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static void account() {
        // Pseudo code
        PiggyBank piggyBank = new PiggyBank();

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        piggyBank.inquiryAccount();
        System.out.println("The piggy bank holds $" + piggyBank.getBalance());

    }

    public static void main(String[] args) {

        account();

    }
}
