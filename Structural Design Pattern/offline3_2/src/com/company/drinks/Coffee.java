package com.company.drinks;

import com.company.burger.Burger;

public class Coffee extends Drinks {
    public Coffee(Burger burger) {
        super(burger);
        this.cost=60;
        System.out.println("For a Coffee, you pay an extra tk."+this.cost);
    }
    @Override
    public double getPrice() {
        return burger.getPrice()+cost;
    }
}
