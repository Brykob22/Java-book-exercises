package com.java.coffee;

import java.util.HashMap;
import java.util.Map;

public class Recipes {
	
    private Map<String, Recipe> recipes;

    public Recipes() {
    	
        recipes = new HashMap<>();

        // 355 ml
        recipes.put("americano_355", new Recipe("Americano", 355, 14, 7, 0, 0, 0, 0));
        recipes.put("milk_355", new Recipe("Coffee with milk", 355, 18, 11, 71, 0, 0, 0));
        recipes.put("chocolate_355", new Recipe("Coffee with chocolate", 355, 14, 7, 107, 0, 0, 11));
        recipes.put("marzipan_355", new Recipe("Coffee with marzipan", 355, 14, 7, 71, 11, 35, 0));

        // 437 ml
        recipes.put("americano_437", new Recipe("Americano", 437, 17, 9, 0, 0, 0, 0));
        recipes.put("milk_437", new Recipe("Coffee with milk", 437, 22, 13, 87, 0, 0, 0));
        recipes.put("chocolate_437", new Recipe("Coffee with chocolate", 437, 17, 9, 131, 0, 0, 13));
        recipes.put("marzipan_437", new Recipe("Coffee with marzipan", 437, 17, 9, 87, 13, 48, 0));

        // 591 ml
        recipes.put("americano_591", new Recipe("Americano", 591, 24, 12, 0, 0, 0, 0));
        recipes.put("milk_591", new Recipe("Coffee with milk", 591, 30, 18, 118, 0, 0, 0));
        recipes.put("chocolate_591", new Recipe("Coffee with chocolate", 591, 24, 12, 117, 0, 0, 18));
        recipes.put("marzipan_591", new Recipe("Coffee with marzipan", 591, 24, 12, 118, 18, 59, 0));
    }

    public Recipe getRecipe(String key) {
        return recipes.get(key);
    }

    public static class Recipe {
        private String name;
        private int cupSize;
        private double coffee;
        private double sugar;
        private double milk;
        private double marzipanPowder;
        private double cream;
        private double chocolatePowder;

        public Recipe(String name, int cupSize, double coffee, double sugar, double milk,
                      double marzipanPowder, double cream, double chocolatePowder) {
        	
            this.name = name;
            this.cupSize = cupSize;
            this.coffee = coffee;
            this.sugar = sugar;
            this.milk = milk;
            this.marzipanPowder = marzipanPowder;
            this.cream = cream;
            this.chocolatePowder = chocolatePowder;
        }

        public String getName() { return name; }
        public int getCupSize() { return cupSize; }
        public double getCoffee() { return coffee; }
        public double getSugar() { return sugar; }
        public double getMilk() { return milk; }
        public double getMarzipanPowder() { return marzipanPowder; }
        public double getCream() { return cream; }
        public double getChocolatePowder() { return chocolatePowder; }
    }
    
}