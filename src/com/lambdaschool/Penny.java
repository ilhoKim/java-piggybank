package com.lambdaschool;

public class Penny extends UsCurrency{

    public Penny() {
        super("Penny", 1, 0.01);
    }

    public Penny(int count) {
        super("Penny", count, 0.01);
    }

}
