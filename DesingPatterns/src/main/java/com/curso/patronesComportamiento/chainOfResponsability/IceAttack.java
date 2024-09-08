package com.curso.patronesComportamiento.chainOfResponsability;

public class IceAttack extends ElementaryAttack{

    public IceAttack() {
    }

    public IceAttack(ElementaryAttack next) {
        super(next);
    }

    @Override
    public void attack(Player player) {

        if (player.getTypePlayer().equals(TypePlayer.WARRIOR)) {
            System.out.println("ICE ATTACK");
        } else if (hasNext()) {
            getNext().attack(player);
        }else {
            System.out.println("not attack was found");
        }
    }
}
