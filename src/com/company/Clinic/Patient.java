package com.company.Clinic;

import java.util.Comparator;
import java.util.Random;

public class Patient {

    public static final int PATIENCE_LIMIT = 500;

    private int damage;
    private int waitTime;
    private boolean isAngry;
    private int patientID;

    public Patient(){
        damage = new Random().nextInt(100) + 1;
        waitTime = new Random().nextInt(1000);
        isAngry = new Random().nextBoolean();
        patientID = new Random().nextInt();
    }


    // Patient gets angry
    public void increaseWaitTime(){
        this.waitTime++;

        // If waited too long, get angry lol
        if(waitTime >= PATIENCE_LIMIT) {
            this.isAngry = true;
        }
    }

    public int getDamage() {
        return damage;
    }

    public int getPatientID() {
        return patientID;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public boolean isAngry() {
        return isAngry;
    }
}
