package com.curso.patronesEstructurales.decorator.decorator;

import com.curso.patronesEstructurales.decorator.Enemy;

public class AssassinEnemyDecorator extends EnemyDecorator{

    public AssassinEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("AssassinEnemyDecorator attack");
    }
}
