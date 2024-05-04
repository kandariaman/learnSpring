package com.in28minutes.learnspringframework.game;

public class PacManGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Pac move up");
    }

    @Override
    public void down() {
        System.out.println("Pac move down");
    }

    @Override
    public void left() {
        System.out.println("Pac move left");
    }

    @Override
    public void right() {
        System.out.println("Pac move right");
    }
}
