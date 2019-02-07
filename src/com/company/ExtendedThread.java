package com.company;

import java.lang.Thread;

/**
 * Class to extend thread class to allow run method to access itself
 */
public class ExtendedThread extends Thread{
    @Override
    public void run() {
        System.out.println("------------------------------\nExtended Thread Test ---------");
        System.out.println("Thread ID: " + this.getId());
        System.out.println("Thread Name: " + this.getName());
    }
}
