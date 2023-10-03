package com.ahmedatef.springframework.looselycoupled.interfaces;

public class TestDrive {

    public static void main(String[] args) {
        GamingConsole marioGame = new MarioGame();
        GamingConsole superContraGame = new SuperContraGame();
        GamingConsole pacmanGame = new PacmanGame();
        GameRunner gameRunner = new GameRunner(pacmanGame);
        gameRunner.run();
    }
}
