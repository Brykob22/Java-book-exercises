package com.java.coffee;

public class Supplies {
	
    private int coffee;           // grams
    private int sugar;            // grams
    private int milk;             // milliliters
    private int marzipanPowder;   // grams
    private int cream;            // milliliters
    private int chocolatePowder;  // grams

    public Supplies() {
    	
        this.coffee = 500;
        this.sugar = 500;
        this.milk = 2000;
        this.marzipanPowder = 500;
        this.cream = 500;
        this.chocolatePowder = 500;
        
    }

    public boolean hasEnough(int coffee, int sugar, int milk, int marzipanPowder, int cream, int chocolatePowder) {
    	
        return this.coffee >= coffee &&
               this.sugar >= sugar &&
               this.milk >= milk &&
               this.marzipanPowder >= marzipanPowder &&
               this.cream >= cream &&
               this.chocolatePowder >= chocolatePowder;
    }

    public void useSupplies(int coffee, int sugar, int milk, int marzipanPowder, int cream, int chocolatePowder) {
    	
        this.coffee -= coffee;
        this.sugar -= sugar;
        this.milk -= milk;
        this.marzipanPowder -= marzipanPowder;
        this.cream -= cream;
        this.chocolatePowder -= chocolatePowder;
    }
}