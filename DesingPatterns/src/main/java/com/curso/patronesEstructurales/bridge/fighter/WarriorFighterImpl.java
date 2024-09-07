package com.curso.patronesEstructurales.bridge.fighter;

public class WarriorFighterImpl implements Fighter {
    @Override
    public void attack() {
        System.out.println("WARRIOR ATTACK");

    }

    @Override
    public void protect() {
        System.out.println("WARRIOR PROTECT");

    }
}
