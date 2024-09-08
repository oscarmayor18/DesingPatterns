package com.curso.patronesEstructurales.proxy;

import com.curso.patronesEstructurales.proxy.GameImpl;
import com.curso.patronesEstructurales.proxy.ProxyGameImpl;

public class TestProxy {
    public static void main(String[] args) {
        GameImpl game = new GameImpl();
        game.newGame("player1");
        ProxyGameImpl proxyGame = new ProxyGameImpl(game);
        proxyGame.load("player1");
        System.out.println(proxyGame.getStats());
        proxyGame.getStats().setKill(10);
        proxyGame.getStats().setDeaths(2);
        proxyGame.getStats().setLevel(10);
        proxyGame.save("player1");
        proxyGame.load("player1");
        System.out.println(proxyGame.getStats());
    }
}
