package com.hdfc.bankapp;

public abstract class BankImp1 implements  Ibank {

    public BankImp1(){
        super(); //Object
    }
    @Override
    public void deposit() {
        System.out.println("Amount Deposited Successfully");
    }

    public abstract void withdraw();
}

