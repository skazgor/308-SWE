package com.company;

public class Cashier extends Employees{
    Cashier(String name ){
        super(name);
    }
    @Override
    void approveLoan() {
        System.out.println("You don't have permission for this operation.");
    }

    @Override
    void changeRate(String s,double rate) {
        System.out.println("You don't have permission for this operation.");

    }

    @Override
    void SeeInternalFund() {
        System.out.println("you don't have permission for this operation");

    }
}
