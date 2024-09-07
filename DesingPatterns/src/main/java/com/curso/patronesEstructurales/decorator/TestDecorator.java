package com.curso.patronesEstructurales.decorator;

import com.curso.patronesEstructurales.decorator.decorator.AssassinEnemyDecorator;
import com.curso.patronesEstructurales.decorator.decorator.MageEnemyDecorator;
import com.curso.patronesEstructurales.decorator.decorator.WarriorEnemyDecorator;
import com.curso.patronesEstructurales.decorator.race.Elf;
import com.curso.patronesEstructurales.decorator.race.Human;

public class TestDecorator {
    public static void main(String[] args) {
        System.out.println("========HUMAN WARRIOR========");
        Enemy humanWarrior = new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();
        System.out.println("========HUMAN WARRIOR MAGE========");
        Enemy humanWarriorMage = new WarriorEnemyDecorator(new MageEnemyDecorator(new Human()));
        humanWarriorMage.attack();
        System.out.println("========ELFO WARRIOR MAGE ASSASIN========");
        Enemy elfWarriorMageAssasin = new AssassinEnemyDecorator(new MageEnemyDecorator( new WarriorEnemyDecorator(new Elf())));
        elfWarriorMageAssasin.attack();
    }
}
