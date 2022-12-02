package com.example.pingpong;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Tab;
import javafx.scene.paint.Color;

public class Bar {

    public int x_coordinate;
    public int y_coordinate;

    public Bar(int x_coordinate,int y_coordinate){
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    public  int getY_coordinate() {
        return y_coordinate;
    }

    public  int getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(int x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public void setY_coordinate(int y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    public static void drawBar(GraphicsContext graphicsContext){
        graphicsContext.setFill(Color.WHITE);
        for(int i = 0; i<Main.gameBar.size();i++){
            graphicsContext.fillRect(Main.gameBar.get(i).x_coordinate* Table.fieldsize,Main.gameBar.get(i).y_coordinate* Table.fieldsize,Table.fieldsize,Table.fieldsize);
        }
    }


}
