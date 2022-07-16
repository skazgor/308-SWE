package com.company;

public class FixedDeposit extends Account{
   private static double interest=.15;

    public FixedDeposit(String name, double amount) {
        super(name,"Student", (float) amount);
        System.out.println("Fixed deposit account for "+name+" created;initial balance "+ amount);

    }

    @Override
    public void deposit(double amount) {
        if(amount <50000){
            System.out.println(" Amount must be greater than 50,000!");
        }else {
           this.setBalance(getBalance()+amount);
            System.out.println(amount+"$ deposited; current balance"+getBalance());
            Bank.increment(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if(time<1 && getBalance()-amount<0){
            System.out.println("Invalid transaction. Current balance "+getBalance());
        }else{
            setBalance(getBalance()-amount);
            System.out.println("Withdrawn"+amount+"!Current amount"+getBalance());
            Bank.decrement(amount);
        }

    }

    @Override
    public void request(double amount) {
        if(amount<100000){
            Bank.request(this,amount);
        }
        else {
            System.out.println(" Invalid request!");
        }
    }

    @Override
    public double getInterest() {
        return interest;
    }
    public static void  setRate( double rate){
        System.out.println(" Rate change to :"+rate);
        interest=rate/100;
    }
}
