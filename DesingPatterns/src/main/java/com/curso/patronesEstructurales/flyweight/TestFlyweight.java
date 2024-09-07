package com.curso.patronesEstructurales.flyweight;

import com.curso.patronesEstructurales.flyweight.assets.Animation;
import com.curso.patronesEstructurales.flyweight.assets.Prefab;
import com.curso.patronesEstructurales.flyweight.assets.Sounds;
import com.curso.patronesEstructurales.flyweight.assets.Textures;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class TestFlyweight {
    public static void main(String[] args) {
        List<Animation> animations = Arrays.asList(new Animation("walk"), new Animation("run"));
        List<Textures> textures = Arrays.asList(new Textures("Textures1"), new Textures("Textures2"));
        List<Sounds> sounds = Arrays.asList(new Sounds("bla"), new Sounds("ble"));
        Prefab prefab = new Prefab(animations,textures,sounds);
        Npc npc1 = new Npc(prefab);
        Npc npc2 = new Npc(prefab);
        System.out.println("========NPC1==========");
        npc1.showNpc();
        System.out.println("========NPC2==========");
        npc2.showNpc();
    }
}
