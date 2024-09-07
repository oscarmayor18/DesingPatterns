package com.curso.patronesEstructurales.decorator.race;

import com.curso.patronesEstructurales.decorator.Enemy;

public class Elf implements Enemy {
    @Override
    public void attack() {
        System.out.println("Elf Attack");
    }
}
