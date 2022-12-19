package com.example.pingpong;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Table {

    public static int rows = 50;
    public static int columns = 70;

    public static int fieldsize = Border.height/rows;


    public static void drawTable(GraphicsContext graphicsContext){
        
        graphicsContext.setFill(Color.BLACK);
        for(int row = 0; row < rows;row++){
            
            for(int column = 0; column < columns; column++){
                graphicsContext.fillRect(row*fieldsize,column*fieldsize,Border.width,Border.width);
            }
        }
    }

}
