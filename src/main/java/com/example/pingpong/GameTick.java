package com.example.pingpong;

public class GameTick {

    public static void ticking(){
        Table.drawTable(Main.graphicsContext);
        Bar.drawBar(Main.graphicsContext);
        Ball.drawBall(Main.graphicsContext);
        HighScore.drawingHighscore(Main.graphicsContext);
    }
}
