package com.company.appetizer;

import com.company.burger.Burger;

public class OnionRings extends Appetizer{
    public OnionRings(Burger burger) {
        super(burger);
        this.cost=20;
        System.out.println("For Onion Rings , you pay an extra tk."+this.cost);
    }
    @Override
    public double getPrice() {
        return burger.getPrice()+cost;
    }
}
