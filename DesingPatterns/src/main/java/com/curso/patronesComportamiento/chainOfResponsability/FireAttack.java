package com.curso.patronesComportamiento.chainOfResponsability;

public class FireAttack extends ElementaryAttack{
    public FireAttack(ElementaryAttack next) {
        super(next);
    }

    public FireAttack() {
    }

    @Override
    public void attack(Player player) {
        if (player.getTypePlayer().equals(TypePlayer.VAMP)) {
            System.out.println("FIRE ATTACK");
        } else if (hasNext()) {
            getNext().attack(player);
        }else {
            System.out.println("not attack was found");
        }
    }
}
