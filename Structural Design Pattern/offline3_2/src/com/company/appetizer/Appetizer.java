package com.company.appetizer;

import com.company.burger.Burger;

abstract class Appetizer extends Burger {
    protected Burger burger;
    public double cost;
    public Appetizer(Burger burger){
        this.burger=burger;
    }
    @Override
    public double getPrice(){
        return burger.getPrice();
    }
}
