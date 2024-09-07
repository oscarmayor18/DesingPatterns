package com.curso.patronesCreacionales.abstractFactory.factory;

import com.curso.patronesCreacionales.abstractFactory.enemy.Enemy;
import com.curso.patronesCreacionales.abstractFactory.weapon.Weapon;
import com.curso.patronesCreacionales.abstractFactory.armor.Armor;

public abstract class EnemyAbstractFactory {
    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
