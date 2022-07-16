package com.company;

import com.company.appetizer.FrenchFry;
import com.company.appetizer.OnionRings;
import com.company.burger.Beef;
import com.company.burger.Burger;
import com.company.burger.Veggi;
import com.company.cheese.Cheese;
import com.company.drinks.Coffee;
import com.company.drinks.Coke;
import com.company.drinks.Water;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Using wrappers in different scenario.***");


        System.out.println("\nScenario-1: Beef burger with French fry and cheese");
        Burger burger=new Beef();
        burger=new Cheese(burger);
        burger=new FrenchFry(burger);
        System.out.println("Total Cost: tk."+burger.getPrice());

        System.out.println("\nScenario-2:  Veggi Burger with onion rings and Bottle of Water");
        burger=new Veggi();
        burger=new OnionRings(burger);
        burger=new Water(burger);
        System.out.println("Total Cost: tk."+burger.getPrice());

        System.out.println("\nScenario-3: A combo meal with Veggi burger, French Fry and Coke");
        burger=new Veggi();
        burger=new FrenchFry(burger);
        burger=new Coke(burger);
        System.out.println("Total Cost: tk."+burger.getPrice());

        System.out.println("\nScenario-4: A combo meal with Veggi burger, Onion Rings, Coffee and Water");
        burger=new Veggi();
        burger=new OnionRings(burger);
        burger=new Coffee(burger);
        burger=new Water(burger);
        System.out.println("Total Cost: tk."+burger.getPrice());

        System.out.println("\nScenario-5: A Beef burger only");
        burger=new Beef();
        System.out.println("Total Cost: tk."+burger.getPrice());
    }
}
