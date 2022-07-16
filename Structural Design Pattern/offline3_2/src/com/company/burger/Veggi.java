package com.company.burger;

public class Veggi extends Burger{
    public Veggi(){
        System.out.println("The basic burger with some vegetable.");
        System.out.println("You need to pay tk."+this.getPrice()+" for this.");
    }
    @Override
    public double getPrice() {
        return basePrice;
    }
}
