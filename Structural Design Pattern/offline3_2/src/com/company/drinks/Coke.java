package com.company.drinks;

import com.company.burger.Burger;

public class Coke extends Drinks {
    public Coke(Burger burger) {
        super(burger);
        this.cost=20;
        System.out.println("For a Coke, you pay an extra tk."+this.cost);
    }
    @Override
    public double getPrice() {
        return burger.getPrice()+cost;
    }
}
