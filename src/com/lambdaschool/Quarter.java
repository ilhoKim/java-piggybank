package com.lambdaschool;

public class Quarter extends UsCurrency{

    public Quarter() {
        super("Quarter", 1, 0.25);
    }

    public Quarter(int count) {
        super("Quarter", count, 0.25);
    }

}
