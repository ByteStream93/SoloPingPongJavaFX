package com.example.pingpong;

public class LogicBall {

    public static void logic(){
        hitBar();
        checkBorder();
    }

    public static void hitBar() {

        for (int i = 0; i < Main.gameBar.size(); i++) {
            if (Main.gameBar.get(i).getX_coordinate() + 1 == Main.ball.getX_coordinate() && Main.gameBar.get(i).y_coordinate == Main.ball.y_coordinate) {
                BallDirection.setMoving_x(1);

                if (i == 0) {
                    BallDirection.setMoving_y(-2);
                }
                if (i == 1) {
                    BallDirection.setMoving_y(-1);
                }
                if (i == 2) {
                    BallDirection.setMoving_y(1);
                }
                if (i == 3) {
                    BallDirection.setMoving_y(2);
                }
                HighScore.score++;
            }
            if(Main.gameBar.get(i).getX_coordinate()==Main.ball.getX_coordinate()&&Main.gameBar.get(i).getY_coordinate()+1==Main.ball.getY_coordinate()){
                BallDirection.setMoving_x(1);
                BallDirection.setMoving_y(3);
                HighScore.score++;
            }
            if(Main.gameBar.get(i).getX_coordinate()==Main.ball.getX_coordinate()&&Main.gameBar.get(i).getY_coordinate()-1==Main.ball.getY_coordinate()){
                BallDirection.setMoving_x(1);
                BallDirection.setMoving_y(-3);
                HighScore.score++;
            }

        }
    }
        public static void checkBorder(){
            if(Main.ball.y_coordinate<=0 || Main.ball.y_coordinate>=Table.rows-3){
                BallDirection.setMoving_y(BallDirection.getMoving_y()*(-1));
            }
            if(Main.ball.x_coordinate==0){
                System.exit(0);
        }
            if(Main.ball.x_coordinate==Table.columns-2){
                BallDirection.setMoving_x(BallDirection.getMoving_x()*(-1));
            }


    }



}
