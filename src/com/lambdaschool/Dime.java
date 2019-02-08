package com.lambdaschool;

public class Dime extends UsCurrency{

    public Dime() {
        super("Dime", 1, 0.1);
    }

    public Dime(int count) {
        super("Dime", count, 0.1);
    }

}
