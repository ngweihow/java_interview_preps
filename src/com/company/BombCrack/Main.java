package com.company.BombCrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Bomb Situation Multi-Threading exercise
 * Written by: Ng Wei How (https://github.com/ngweihow/)
 *
 * Adapted and modified from the course by Michael Pogrebinsky
 * (https://www.udemy.com/java-multithreading-concurrency-performance-optimization/)
 */
public class Main {
    public static final int MAX_PW = 9999;

    public static void main(String[] args) {

        Random random = new Random();

        Bomb bomb = new Bomb(random.nextInt(MAX_PW));

        // Adding the different diffuser and timer to list
        List<Thread> bombSituation = new ArrayList<>();

        bombSituation.add(new OddDefuser(bomb));
        bombSituation.add(new EvenDefuser(bomb));
        bombSituation.add(new BombTimer());

        // Start each thread
        for(Thread t: bombSituation) {
            t.start();
        }
    }
}
