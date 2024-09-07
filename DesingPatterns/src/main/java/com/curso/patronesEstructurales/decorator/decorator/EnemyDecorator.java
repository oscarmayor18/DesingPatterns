package com.curso.patronesEstructurales.decorator.decorator;

import com.curso.patronesEstructurales.decorator.Enemy;

public abstract class EnemyDecorator implements Enemy {

    protected Enemy enemy;

    public EnemyDecorator(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public void attack() {
        enemy.attack();
    }
}
