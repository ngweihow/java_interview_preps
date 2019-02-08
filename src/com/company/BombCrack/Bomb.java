package com.company.BombCrack;

import java.lang.Thread;

public class Bomb {
    private int defuser;
    public Bomb (int defuser) {
        this.defuser = defuser;
    }

    /**
     * Defuse the bomb guess/attempt
     * @param attempt Integer digit guess to defuse the Bomb
     * @return Whether the attempt at defusing worked
     */
    public boolean defuse(int attempt) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Error in Bomb");
        }
        return attempt == this.defuser;
    }
}
