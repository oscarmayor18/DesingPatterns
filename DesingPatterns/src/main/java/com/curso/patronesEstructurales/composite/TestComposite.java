package com.curso.patronesEstructurales.composite;

public class TestComposite {
    public static void main(String[] args) {
        BaseItem inventory = new Bag("invetory");
        BaseItem bagCoins = new Bag("bagCoins");
        BaseItem bagPotions = new Bag("bagPotions");

        BaseItem coins = new Item("Coins",3);
        bagCoins.add(coins);
        BaseItem magicPotions = new Item("magicPotions",3);
        BaseItem healthPotions = new Item("healthPotions",3);
        bagPotions.add(magicPotions);
        bagPotions.add(healthPotions);

        BaseItem blade = new Item("blade",3);
        BaseItem shield = new Item("shield",3);
        inventory.add(bagCoins);
        inventory.add(bagPotions);
        inventory.add(blade);
        inventory.add(shield);

        System.out.println("inventory total value: " + inventory.getValue());
    }
}
