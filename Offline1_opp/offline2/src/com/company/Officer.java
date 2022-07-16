package com.company;

public class Officer extends Employees {
    Officer(String name){
        super(name);
    }
    @Override
    void approveLoan() {
        Bank.approveLoan();
    }

    @Override
    void changeRate(String s,double rate) {
        System.out.println("you don't have permission for this operation");
    }

    @Override
    void SeeInternalFund() {
        System.out.println("you don't have permission for this operation");

    }
}
