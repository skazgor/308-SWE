package com.company;

public abstract class  Employees {
    String name;
    Employees(){};
    Employees(String name ){
        this.name=name;
    }
    void lookup(Account a){
        System.out.println(a.name+"'s current balance is "+a.getBalance()+"$");
    }
    abstract void approveLoan();
    abstract void changeRate(String s,double rate);
    abstract void SeeInternalFund();

}
