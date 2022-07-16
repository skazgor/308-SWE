package com.company;

import java.util.ArrayList;

public  class Bank {
    private static double fund = 100000;
    Account current=null;
    Employees employee;
    boolean f=false;
    static Request req =null;
    final double loanInterest=.1;
    private ArrayList<Account> accounts=new ArrayList<>();
    private ArrayList<Employees> employees =new ArrayList<>();

    Bank(){
        employees.add( new ManagingDirector("MD"));
        employees.add( new Officer("S1"));
        employees.add( new Officer("S2"));
        employees.add( new Cashier("C1"));
        employees.add( new Cashier("C2"));
        employees.add( new Cashier("C3"));
        employees.add( new Cashier("C4"));
        employees.add( new Cashier("C5"));
        System.out.println("Bank Created; MD, S1, S2, C1, C2, C3, C4, C5 created");

    }
    static void increment(double amount) {
        fund += amount;
    }

    static void decrement(double amount) {
        fund -= amount;
    }
    static void request(Account a, double amount){
        req=new Request();
        req.a=a;
        req.amount=amount;
        req.approve=false;
        req.status =true;
    }
    public void crateAccount(String name,String type,double amount){
        if(type.equalsIgnoreCase("Student")){
             accounts.add((Account) (current=new Student(name,amount)));
        }
      else  if(type.equalsIgnoreCase("Savings")){
            accounts.add((Account) (current=new Savings(name,amount)));
        }
       else if(type.equalsIgnoreCase("FixedDeposit")){
            accounts.add((Account) (current=new FixedDeposit(name,amount)));
        }
        else if(type.equalsIgnoreCase("Loan")){
            accounts.add((Account) (current=new Loan(name,amount)));
        }



    }
    void deposit(double amount){
        current.deposit(amount);
    }
    public static void approveLoan() {
        if(req!=null){
            System.out.println("Loan for "+req.a.name+"approved");
            req.a.setBalance(req.a.getBalance()+ req.amount);
            req.a.loan+=req.amount;
            req.status=false;
        }
        else{
            System.out.println(" No loan to approve!");
        }
    }

    void yearChange(){
        for (Account account :
             accounts) {
            System.out.println("year passed");
            account.time++;
            account.setBalance(account.getBalance()-account.loan*loanInterest);
            account.setBalance(account.getBalance()* account.getInterest()-500);
        }
    }
    public static double getInternalBalance(){
        return fund;
    }

    public void withdraw(double nextDouble) {
        current.withdraw(nextDouble);
    }

    public void query() {
        current.query();
    }

    public void request(double nextDouble) {
        current.request(nextDouble);
    }

    public void close() {
        if(!f){
            System.out.println("Transaction Closed for "+current.name);
            current =null;
        }
        else {
            System.out.println("operation for "+employee.name+" close");
            employee=null;
        }
    }

    public void open(String next) {
        boolean bool=true;
        for (Employees e:
             employees) {
            if(e.name.equalsIgnoreCase(next)){
                bool=false;
                current=null;
                employee=e;
                f=true;
                System.out.print(e.name+" Active;");
                if(req!=null){
                    if(req.status){
                        System.out.println("there are loan approvals pending");
                    }
                }
            }
        }
        if(bool){
            for (Account a:
                 accounts) {
                if (a.name.equalsIgnoreCase(next)) {
                    current=a;
                    f=false;
                    employee=null;
                    System.out.println("Welcome back,"+a.name);
                }
            }
        }
    }

    public void approve() {
        employee.approveLoan();
    }

    public void change(String next, double nextDouble) {
        employee.changeRate(next,nextDouble);
    }

    public void lookup(String next) {
        for (Account a:
             accounts) {
            if(a.name.equalsIgnoreCase(next)){
                employee.lookup(a);
            }
        }
    }

    public void see() {
        employee.SeeInternalFund();
    }
}
class Request {
    boolean status=false;
    Account a;
    boolean approve;
    double amount;
}
