package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class AppGaming01BasicJava {

    public static void main(String[] args) {

        var superContraGame = new SuperContraGame();
        var marioGame = new MarioGame();
        var pacGame = new PacManGame();
        var gameRunner = new GameRunner(pacGame);
        gameRunner.run();
    }
}
