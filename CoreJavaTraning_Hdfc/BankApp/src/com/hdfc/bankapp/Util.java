package com.hdfc.bankapp;

public class Util {
    public  static  Ibank getObject(){
        return new BankImp2();
    }
}
