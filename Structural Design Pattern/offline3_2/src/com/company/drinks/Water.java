package com.company.drinks;

import com.company.burger.Burger;

public class Water extends Drinks {
    public Water(Burger burger) {
        super(burger);
        this.cost=15;
        System.out.println("For water, you pay an extra tk."+this.cost);
    }
    @Override
    public double getPrice() {
        return burger.getPrice()+cost;
    }
}
