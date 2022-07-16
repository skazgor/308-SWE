package com.company;

public class ManagingDirector extends Employees{

    ManagingDirector(String name){
        super(name);
    }
    @Override
    void approveLoan() {
        Bank.approveLoan();
    }

    @Override
    void changeRate(String s,double rate) {
        if(s.equalsIgnoreCase("Student")){
            Student.setRate(rate);
        }
        else if(s.equalsIgnoreCase("Savings")){
            Savings.setRate(rate);
        }
       else if(s.equalsIgnoreCase("FixedDeposit")){
            FixedDeposit.setRate(rate);
        }

    }

    @Override
    void SeeInternalFund() {
        System.out.println("Internal fund:"+ Bank.getInternalBalance());
    }

}
