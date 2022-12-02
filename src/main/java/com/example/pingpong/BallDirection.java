package com.example.pingpong;

public class BallDirection {

    public static int moving_x;
    public static int moving_y;


    public static int getMoving_x() {
        return moving_x;
    }

    public static int getMoving_y() {
        return moving_y;
    }

    public static void setMoving_x(int moving_x) {
        BallDirection.moving_x = moving_x;
    }

    public static void setMoving_y(int moving_y) {
        BallDirection.moving_y = moving_y;
    }

    public static void movingBall(){
        LogicBall.logic();
        Main.ball.setX_coordinate(Main.ball.getX_coordinate()+moving_x);
        Main.ball.setY_coordinate(Main.ball.getY_coordinate()+moving_y);
    }

}
