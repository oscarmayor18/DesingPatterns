package com.curso.patronesEstructurales.bridge.fighter;

public class MageFighterImpl implements Fighter{
    @Override
    public void attack() {
        System.out.println("MAGE ATTACK");

    }

    @Override
    public void protect() {
        System.out.println("MAGE PROTECT");

    }
}
