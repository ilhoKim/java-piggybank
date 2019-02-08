package com.lambdaschool;

public class Nickel extends UsCurrency{

    public Nickel() {
        super("Nickel", 1, 0.05);
    }

    public Nickel(int count) {
        super("Nickel", count, 0.05);
    }

}
