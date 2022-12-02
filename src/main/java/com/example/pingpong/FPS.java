package com.example.pingpong;

import javafx.animation.AnimationTimer;

public class FPS {
    public static AnimationTimer animationTimer = new AnimationTimer() {
        private long lastUpdate = 0;
        @Override
        public void handle(long now) {
            if(now-lastUpdate>=66666666){
                GameTick.ticking();
                lastUpdate=now;
            }
        }
    };
}
