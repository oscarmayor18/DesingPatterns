package com.curso.patronesCreacionales.abstractFactory.factory;

import com.curso.patronesCreacionales.abstractFactory.armor.Armor;
import com.curso.patronesCreacionales.abstractFactory.armor.Robe;
import com.curso.patronesCreacionales.abstractFactory.enemy.Enemy;
import com.curso.patronesCreacionales.abstractFactory.enemy.Mage;
import com.curso.patronesCreacionales.abstractFactory.weapon.Weapon;
import com.curso.patronesCreacionales.abstractFactory.weapon.WizardStaff;

public class MageFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Mage();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }
}
