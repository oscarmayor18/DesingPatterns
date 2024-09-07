package com.curso.patronesEstructurales.flyweight;

import com.curso.patronesEstructurales.flyweight.assets.Prefab;

import java.util.ArrayList;
import java.util.List;

public class Npc {
    private static int id;
    private  String name;
    private int health;
    private  static final int MAX_HEALTH = 100;
    private Coordinates coordinates;
    private Prefab prefab;

    public Npc(Prefab prefab) {
        this.name = "NPC" + id;
        this.health = MAX_HEALTH;
        this.coordinates = Coordinates.getCoordinates();
        this.prefab = prefab;
        id++;
    }

    public void showNpc(){
        System.out.println("name : " + name);
        System.out.println("health : " + health);
        System.out.println(coordinates);
        System.out.println("=======PREFAB=========");
        System.out.println(prefab);
    }
}
