package com.lambdaschool;

public class Dollar extends UsCurrency{

    public Dollar() {
        super("Dollar", 1, 1.00);
    }

    public Dollar(int count) {
        super("Dollar", count, 1.00);
    }

}
