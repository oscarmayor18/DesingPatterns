package com.curso.patronesEstructurales.bridge.enemy;

import com.curso.patronesEstructurales.bridge.fighter.Fighter;
import com.curso.patronesEstructurales.bridge.fighter.MageFighterImpl;

public class Mage extends Enemy  {
    public Mage() {
        setFighter(new MageFighterImpl());
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }


    public void attack() {
        System.out.println("MAGE:");
        getFighter().attack();
    }


    public void protect() {
        System.out.println("MAGE:");
        getFighter().protect();
    }

    @Override
    public Fighter getFighter() {
        return super.getFighter();
    }

    @Override
    public void setFighter(Fighter fighter) {
        super.setFighter(fighter);
    }
}
