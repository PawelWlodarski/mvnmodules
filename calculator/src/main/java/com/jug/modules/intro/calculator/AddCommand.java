package com.jug.modules.intro.calculator;

public class AddCommand {
    private int i1;
    private int i2;

    public AddCommand(int i1, int i2) {
        this.i1 = i1;
        this.i2 = i2;
    }

    public int getI1() {
        return i1;
    }

    public int getI2() {
        return i2;
    }
}
