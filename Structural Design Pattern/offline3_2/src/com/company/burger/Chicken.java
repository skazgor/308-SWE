package com.company.burger;

public class Chicken extends Burger{
    public Chicken(){
        additionalCost=30;
        System.out.println("The basic burger with Chicken.");
        System.out.println("You need to pay tk."+this.getPrice()+" for this.");
    }
    @Override
    public double getPrice() {
        return basePrice+additionalCost;
    }
}
