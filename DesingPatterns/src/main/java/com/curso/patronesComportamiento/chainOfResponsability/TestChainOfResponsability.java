package com.curso.patronesComportamiento.chainOfResponsability;

public class TestChainOfResponsability {
    public static void main(String[] args) {
        Player player = new Player(TypePlayer.VAMP);
        Mage  mage = new Mage(new FireAttack(new IceAttack(new ElectriAttack())));
        mage.chainAttack(player);
    }
}
