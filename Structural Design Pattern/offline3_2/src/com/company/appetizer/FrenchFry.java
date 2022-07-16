package com.company.appetizer;

import com.company.burger.Burger;

public class FrenchFry extends Appetizer{
    public FrenchFry(Burger burger) {
        super(burger);
        this.cost=30;
        System.out.println("For French Fry , you pay an extra tk."+this.cost);
    }
    @Override
    public double getPrice() {
        return burger.getPrice()+cost;
    }
}
