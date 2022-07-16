package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        Bank bank = new Bank();
        while (true) {
            String s = scanner.next();
            if (s.equalsIgnoreCase("create")) {
           bank.crateAccount(scanner.next(),scanner.next(),scanner.nextDouble());
            }
            else if(s.equalsIgnoreCase("deposit")){
                bank.deposit(scanner.nextDouble());
            }
            else if(s.equalsIgnoreCase("withdraw")){
                bank.withdraw(scanner.nextDouble());
            }
            else if (s.equalsIgnoreCase("query")){
                bank.query();
            }
            else if(s.equalsIgnoreCase("request")){
                bank.request(scanner.nextDouble());
            }
            else if(s.equalsIgnoreCase("close")){
                bank.close();
            }
            else if(s.equalsIgnoreCase("open")){
                bank.open(scanner.next());
            }
            else if(s.equalsIgnoreCase("approve")){
                bank.approve();
            }
            else if(s.equalsIgnoreCase("change")){
                bank.change(scanner.next(),scanner.nextDouble());
            }
            else if(s.equalsIgnoreCase("lookup")){
                bank.lookup(scanner.next());
            }
            else if(s.equalsIgnoreCase("see")){
                bank.see();
            }
            else if(s.equalsIgnoreCase("inc")){
                bank.yearChange();
            }
            else if(s.equalsIgnoreCase("exit")){
                System.out.println("end bank");
                break;
            }
            else{
                System.out.println("incorrect command");
            }
        }
    }
}
