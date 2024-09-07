package com.curso.patronesCreacionales.abstractFactory;

import com.curso.patronesCreacionales.abstractFactory.armor.Armor;
import com.curso.patronesCreacionales.abstractFactory.enemy.Enemy;
import com.curso.patronesCreacionales.abstractFactory.factory.EnemyAbstractFactory;
import com.curso.patronesCreacionales.abstractFactory.factory.MageFactory;
import com.curso.patronesCreacionales.abstractFactory.factory.WarriorFactory;
import com.curso.patronesCreacionales.abstractFactory.weapon.Weapon;

public class TestAbstractFactory {
    public static void main(String[] args) {
        EnemyAbstractFactory factory = new WarriorFactory();
        Enemy warrior = factory.createEnemy();
        Armor heavyArmor = factory.createArmor();
        Weapon axe = factory.createWeapon();
        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        factory = new MageFactory();
        Enemy mage = factory.createEnemy();
        Armor robe = factory.createArmor();
        Weapon wizardStaff = factory.createWeapon();
        mage.attack();
        robe.protect();
        wizardStaff.damage();
    }
}
