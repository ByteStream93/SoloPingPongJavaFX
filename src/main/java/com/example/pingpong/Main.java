package com.example.pingpong;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static GraphicsContext graphicsContext;

    public static ArrayList<Bar> gameBar = new ArrayList<>(){{
        add(new Bar(2,21));
        add(new Bar(2,22));
        add(new Bar(2,23));
        add(new Bar(2,24));
    }};

    public static Ball ball = new Ball(3,22);

    @Override
    public void start(Stage primaryStage) {
    Group group = new Group();
    Scene gameScene = new Scene(group);
    Canvas gameCanvas = new Canvas(Border.width,Border.height);
        group.getChildren().add(gameCanvas);

        gameScene.setOnKeyPressed(event -> {
            if(KeyCode.UP == event.getCode()) {
                for (int i = 0; i < gameBar.size(); i++) {
                    gameBar.get(i).setY_coordinate(gameBar.get(i).y_coordinate - 1);
                }
            }
                if(KeyCode.DOWN == event.getCode()){
                    for(int i = 0; i<gameBar.size();i++){
                        gameBar.get(i).setY_coordinate(gameBar.get(i).y_coordinate+1);
                    }
            }
        });
    graphicsContext = gameCanvas.getGraphicsContext2D();
    primaryStage.setHeight(Border.height);
    primaryStage.setWidth(Border.width);
    primaryStage.setScene(gameScene);
    primaryStage.show();
    FPS.animationTimer.start();
    }
}
