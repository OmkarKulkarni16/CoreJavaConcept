package com.hdfc.bankapp;

public class BankImp2 extends BankImp1{

    public BankImp2(){
        super(); //BankImp1
    }

    @Override
    public void withdraw() {
        System.out.println("Amount Withdrawn Successfully");
    }
}
