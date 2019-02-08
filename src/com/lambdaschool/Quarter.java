package com.lambdaschool;

public class Quarter extends UsCurrency{

    public Quarter() {
        super("Quarter", 1, 0.25);
    }

    public Quarter(int count) {
        super("Dime", count, 0.25);
    }

}
