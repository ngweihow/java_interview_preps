package com.company.BombCrack;

import java.lang.Thread;

public class BombTimer extends Thread{
    private static final int BOMB_TIME = 15;

    @Override
    public void run() {
        super.run();

        for(int i=BOMB_TIME; i>=0;i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }

            System.out.println("T MINUS " + i + " SECONDS LEFT TILL DETONATION");
        }

        System.out.println("BOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOM!!!!!!");
        System.exit(0);
    }
}
