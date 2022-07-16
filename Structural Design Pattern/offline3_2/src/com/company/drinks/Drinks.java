package com.company.drinks;

import com.company.burger.Burger;

abstract class Drinks extends Burger {
    protected Burger burger;
    public double cost;
    public Drinks(Burger burger){
        this.burger=burger;
    }
    @Override
    public double getPrice(){
        return burger.getPrice();
    }
}
