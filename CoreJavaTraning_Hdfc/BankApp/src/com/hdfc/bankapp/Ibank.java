package com.hdfc.bankapp;

public interface Ibank {
    String IFSC = "HDFC44623542";

    public abstract void deposit();

    public abstract void withdraw();
}
