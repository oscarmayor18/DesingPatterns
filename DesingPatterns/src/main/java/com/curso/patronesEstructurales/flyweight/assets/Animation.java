package com.curso.patronesEstructurales.flyweight.assets;

public class Animation {
    private String Animation;

    public Animation(String animation) {
        Animation = animation;
    }

    @Override
    public String toString() {
        return "Animation{" +
                "Animation='" + Animation + '\'' +
                '}';
    }
}
