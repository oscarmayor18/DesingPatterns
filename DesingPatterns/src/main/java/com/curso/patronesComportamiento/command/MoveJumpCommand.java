package com.curso.patronesComportamiento.command;

public class MoveJumpCommand implements Command{
    private Player player;

    public MoveJumpCommand(Player player) {
        this.player = player;
    }


    @Override
    public void execute() {
        player.jump();
    }
}
