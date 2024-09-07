package com.curso.patronesEstructurales.flyweight.assets;

import java.util.HashMap;
import java.util.Map;

public class AssestsPrefab {
    private static Map<Integer,Prefab> prefabMap= new HashMap<>();

    public static Prefab getPrefab(Prefab prefab){
        int id = prefab.getId();
        if (!prefabMap.containsKey(id)) {
            prefabMap.put(id,prefab);
        }
            return prefabMap.get(id);

    }
}
