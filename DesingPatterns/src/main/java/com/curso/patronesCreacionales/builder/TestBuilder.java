package com.curso.patronesCreacionales.builder;

public class TestBuilder {
    public static void main(String[] args) {
        Enemy enemy = Enemy.builder()
                .setName("OSCAR")
                .setType("")
                .setDamage(8)
                .setEndurance(9)
                .setHealth(1)
                .build();
        System.out.println(enemy);
    }
}
