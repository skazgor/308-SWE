package com.company.burger;

public abstract class Burger {
    public double basePrice;
    public double additionalCost;
    public Burger(){
        this.basePrice=100;
        this.additionalCost=0;
    }
    public abstract double getPrice();
}
