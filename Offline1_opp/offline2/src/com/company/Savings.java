package com.company;

public class Savings extends Account{
    private static  double interest=.1;
    Savings(String name,double amount){
        super(name,"Student", (float) amount);
        System.out.println("Savings account for "+name+" created;initial balance "+ amount);
    }
    @Override
    public void deposit(double amount) {
        super.setBalance(super.getBalance()+amount);
        System.out.println(amount+"$ deposited; current balance"+getBalance());
        Bank.increment(amount);
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance()-amount<1000){
            System.out.println("Invalid transaction. Current balance "+getBalance());
        }else{
            setBalance(getBalance()-amount);
            System.out.println("Withdrawn"+amount+"!Current amount"+getBalance());
            Bank.decrement(amount);
        }
    }

    @Override
    public void request(double amount) {
        if(amount<10000){
            Bank.request(this,amount);
        }
        else {
            System.out.println(" Invalid request!");
        }
    }

    @Override
    public double getInterest() {
        return this.interest;
    }
public static void  setRate( double rate){
    System.out.println(" Rate change to :"+rate);
        interest=rate/100;
    }

}
