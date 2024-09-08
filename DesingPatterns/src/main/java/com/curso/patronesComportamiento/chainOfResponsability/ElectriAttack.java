package com.curso.patronesComportamiento.chainOfResponsability;

public class ElectriAttack extends ElementaryAttack{
    public ElectriAttack() {
    }

    public ElectriAttack(ElementaryAttack next) {
        super(next);
    }

    @Override
    public void attack(Player player) {
        if (player.getTypePlayer().equals(TypePlayer.MAGE)) {
            System.out.println("ELECTRI ATTACK");
        } else if (hasNext()) {
            getNext().attack(player);
        }else {
            System.out.println("not attack was found");
        }
    }


}
