package com.curso.patronesEstructurales.decorator.decorator;

import com.curso.patronesEstructurales.decorator.Enemy;

public class WarriorEnemyDecorator extends EnemyDecorator{
    public WarriorEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("warrior attack");
    }
}
