package com.curso.patronesEstructurales.adapter;
/*
Interfaz Target (Enemy):
La interfaz Enemy actúa como el Target en este patrón.
Define la interfaz que el cliente espera usar.
*/
public interface Enemy {
    void attack();
    void damage();
}
