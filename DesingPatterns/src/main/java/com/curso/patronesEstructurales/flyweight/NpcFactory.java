package com.curso.patronesEstructurales.flyweight;

import com.curso.patronesEstructurales.flyweight.assets.AssestsPrefab;
import com.curso.patronesEstructurales.flyweight.assets.Prefab;

public class NpcFactory {
    public static  Npc createNpc(Prefab prefab){
        Prefab prefabnew = AssestsPrefab.getPrefab(prefab);
        Npc npc= new Npc(prefabnew);
        return npc;
    }
}
