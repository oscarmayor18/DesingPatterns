package com.curso.patronesComportamiento.command;

import java.util.Scanner;

public class TestCommand {
    public static void main(String[] args) {
        Player player = new Player(0,0,0);
        MovementInvoker movementInvoker = new MovementInvoker(player);
        Scanner sc = new Scanner(System.in);
        char c = sc.next().trim().toLowerCase().charAt(0);
        while (c != 'q'){
            movementInvoker.move(c);
            c =sc.next().trim().toLowerCase().charAt(0);
        }
    }
}
