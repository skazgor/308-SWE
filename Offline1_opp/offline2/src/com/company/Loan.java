package com.company;

public class Loan extends Account{
    Loan(String name,double amount){
        super(name,"Student", (float) amount);
        System.out.println("Loan account for "+name+ "created ; initial loan "+ amount);
    }

    @Override
    public void deposit(double amount) {
        loan-=amount;
        System.out.println(amount+"$ deposited.current loan"+loan);
        Bank.increment(amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(" You cant withdraw any money from loan account!");
    }

    @Override
    public void request(double amount) {

            Bank.request(this,loan*.05);

            System.out.println(" Loan request Successful!");

    }

    @Override
    public double getInterest() {
        return 0;
    }


}
