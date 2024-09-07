package com.curso.patronesCreacionales.abstractFactory.factory;

import com.curso.patronesCreacionales.abstractFactory.armor.Armor;
import com.curso.patronesCreacionales.abstractFactory.armor.HeavyArmor;
import com.curso.patronesCreacionales.abstractFactory.enemy.Enemy;
import com.curso.patronesCreacionales.abstractFactory.weapon.Axe;
import com.curso.patronesCreacionales.abstractFactory.weapon.Weapon;
import com.curso.patronesCreacionales.abstractFactory.enemy.Warrior;

public class WarriorFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Axe();
    }
}
