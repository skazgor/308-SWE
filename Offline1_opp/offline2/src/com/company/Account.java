package com.company;

public abstract class Account    {
   private float currentBalance=0 ;

   protected String name;
   protected String accountType ;
   protected float loan=0 ;
   protected float time=0;
    public Account(){

    }
    public Account( String name,String accountType , float initial){
        this.accountType=accountType;
        this.name=name;
        if( accountType.contentEquals("Loan")){
            loan= initial;
        }
        else currentBalance=initial;
    }
    public double getBalance() {
        return this.currentBalance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void request(double amount);
    public abstract double getInterest();
    public void query(){
        if(loan>0){
            System.out.println("Current balance:"+ currentBalance+", loan"+loan);
        }
        else {
            System.out.println("Current balance:"+ currentBalance);
        }
    }
    protected void setBalance(double amount){
        currentBalance= (float) amount;
    }
}
