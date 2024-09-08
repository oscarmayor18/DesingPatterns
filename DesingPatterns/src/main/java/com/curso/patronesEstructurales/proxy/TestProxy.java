package com.curso.patronesEstructurales.proxy;

import com.curso.patronesEstructurales.proxy.GameImpl;
import com.curso.patronesEstructurales.proxy.ProxyGameImpl;

public class TestProxy {
    public static void main(String[] args) {
        GameImpl game = new GameImpl();
        game.newGame("player2");
        ProxyGameImpl proxyGame = new ProxyGameImpl(game);
        proxyGame.load("player2");
        System.out.println(proxyGame.getStats());
        proxyGame.getStats().setKill(10);
        proxyGame.getStats().setDeaths(2);
        proxyGame.getStats().setLevel(10);
        proxyGame.save("player2");
        proxyGame.load("player2");
        System.out.println(proxyGame.getStats());
    }
}
