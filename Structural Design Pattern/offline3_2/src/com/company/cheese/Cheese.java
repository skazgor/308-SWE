package com.company.cheese;

import com.company.burger.Burger;

public class Cheese extends Burger {
    protected Burger burger;
    public double cost;
    public Cheese(Burger burger1){
        burger=burger1;
        this.cost=20;
        System.out.println("For Cheese , you pay an extra tk."+this.cost);
    }
    @Override
    public double getPrice() {
        return burger.getPrice()+cost;
    }
}
