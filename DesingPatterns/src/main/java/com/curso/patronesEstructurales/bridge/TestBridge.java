package com.curso.patronesEstructurales.bridge;

import com.curso.patronesEstructurales.bridge.enemy.Mage;
import com.curso.patronesEstructurales.bridge.enemy.Warrior;
import com.curso.patronesEstructurales.bridge.fighter.MageFighterImpl;
import com.curso.patronesEstructurales.bridge.fighter.WarriorFighterImpl;

public class TestBridge {
    public static void main(String[] args) {
        System.out.println("==================WARRIOR=================");
        Warrior warrior = new Warrior();
        warrior.attack();
        warrior.protect();
        warrior.setFighter(new MageFighterImpl());
        warrior.attack();
        warrior.protect();
        System.out.println("==================MAGE=================");
        Mage mage = new Mage();
        mage.attack();
        mage.protect();
        mage.setFighter(new WarriorFighterImpl());
        mage.attack();
        mage.protect();

    }
}
