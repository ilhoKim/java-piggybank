package com.lambdaschool;

public class Dollar extends UsCurrency{

    public Dollar() {
        super("Dollar", 1, 0.25);
    }

    public Dollar(int count) {
        super("Dollar", count, 0.25);
    }

}
