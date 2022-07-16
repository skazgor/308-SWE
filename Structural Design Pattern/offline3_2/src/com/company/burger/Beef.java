package com.company.burger;

public class Beef extends Burger{
    public Beef(){
        additionalCost=50;
        System.out.println("The basic burger with Beef.");
        System.out.println("You need to pay tk."+this.getPrice()+" for this.");
    }
    @Override
    public double getPrice() {
        return basePrice+additionalCost;
    }
}
