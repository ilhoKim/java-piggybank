package com.lambdaschool;

public class UsCurrency {
    public String commonName = "";
    public int count = 0;
    public double parValue = 0;

    public UsCurrency(String commonName, int count, double parValue) {
        this.commonName = commonName;
        this.count = count;
        this.parValue = parValue;
    }

    public String getCommonName() {
        return commonName;
    }

    public int getCount() {
        return count;
    }

    public double getParValue() {
        return parValue;
    }
}
