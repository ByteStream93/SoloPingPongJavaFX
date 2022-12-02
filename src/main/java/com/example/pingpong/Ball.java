package com.example.pingpong;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Ball {
    public int x_coordinate;
    public int y_coordinate;

    public Ball(int x_coordinate,int y_coordinate){
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    public  int getY_coordinate() {
        return y_coordinate;
    }

    public  int getX_coordinate() {
        return x_coordinate;
    }

    public void setY_coordinate(int y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    public void setX_coordinate(int x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public static void drawBall(GraphicsContext graphicsContext){
        BallDirection.movingBall();
        graphicsContext.setFill(Color.RED);
        graphicsContext.fillRect(Main.ball.getX_coordinate()*Table.fieldsize, Main.ball.getY_coordinate()*Table.fieldsize, Table.fieldsize, Table.fieldsize );
    }
}
