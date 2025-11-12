package com.java.coffee;

import javax.swing.JOptionPane;

public class Machine {
	
    private Supplies supplies;
    private Recipes recipes;
    private Resources resources;

    public Machine() {
    	
        supplies = new Supplies();
        recipes = new Recipes();
        resources = new Resources();
        
    }

    public void start() {
    	
        JOptionPane.showMessageDialog(null, "Andatti\n\n\"A great person needs a good coffee\"");

       
        String[] quantityOptions = {"6", "5", "4", "3", "2", "1"};
        int quantityIndex = JOptionPane.showOptionDialog(
                null,
                "How many coffees do you want?",
                "Coffee Quantity",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                quantityOptions,
                quantityOptions[5]);
        if (quantityIndex == -1) return; // user cancelled

       
        int quantity = Integer.parseInt(quantityOptions[quantityIndex]);

        int[] sizes = new int[quantity];
        String[] flavors = new String[quantity];

        for (int i = 0; i < quantity; i++) {
    
            String[] sizeOptions = {"Large 591 ml", "Medium 437 ml", "Small 355 ml"};
            int sizeIndex = JOptionPane.showOptionDialog(
                    null,
                    "Select the size for coffee #" + (i + 1),
                    "Coffee Size",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    sizeOptions,
                    sizeOptions[2]);
            if (sizeIndex == -1) return;

            
            switch (sizeIndex) {
            
                case 0: sizes[i] = resources.getLargeCup(); break;
                case 1: sizes[i] = resources.getMediumCup(); break;
                case 2: sizes[i] = resources.getSmallCup(); break;
                default: sizes[i] = resources.getSmallCup();
                
            }

            String[] flavorOptions = {"Coffee with marzipan", "Coffee with chocolate", "Coffee with milk", "Americano"};
            int flavorIndex = JOptionPane.showOptionDialog(
                    null,
                    "Select flavor for coffee #" + (i + 1),
                    "Coffee Flavor",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    flavorOptions,
                    flavorOptions[3]);
            if (flavorIndex == -1) return;

            
            flavors[i] = flavorOptions[flavorIndex].toLowerCase().trim();
            
        }


        for (int i = 0; i < quantity; i++) {
        	
            String key = getRecipeKey(flavors[i], sizes[i]);
            Recipes.Recipe recipe = recipes.getRecipe(key);

            if (recipe == null) {
            	
                JOptionPane.showMessageDialog(null, "Recipe not found for coffee #" + (i + 1));
                continue;
                
            }
            

            if (!supplies.hasEnough(
                    (int) recipe.getCoffee(),
                    (int) recipe.getSugar(),
                    (int) recipe.getMilk(),
                    (int) recipe.getMarzipanPowder(),
                    (int) recipe.getCream(),
                    (int) recipe.getChocolatePowder())) {
            	
                JOptionPane.showMessageDialog(null, "Not enough supplies for coffee #" + (i + 1));
                continue;
                
            }

            supplies.useSupplies(
                    (int) recipe.getCoffee(),
                    (int) recipe.getSugar(),
                    (int) recipe.getMilk(),
                    (int) recipe.getMarzipanPowder(),
                    (int) recipe.getCream(),
                    (int) recipe.getChocolatePowder());

            JOptionPane.showMessageDialog(null, "Stirring ingredients...");
            JOptionPane.showMessageDialog(null,
                    "Coffee served: " + recipe.getName() + " (" + recipe.getCupSize() + " ml)");
            
        }
        
        JOptionPane.showMessageDialog(null, "Enjoy your coffee!");
        
    }

    private String getRecipeKey(String flavor, int size) {
        String key;
        switch(flavor) {
            case "americano": key = "americano"; break;
            case "coffee with milk": key = "milk"; break;
            case "coffee with chocolate": key = "chocolate"; break;
            case "coffee with marzipan": key = "marzipan"; break;
            default: key = "americano";
            
        }
        
        key += "_" + size;
        return key;
        
    }
    
}