package com.company;

import java.util.*;
import java.lang.Thread;


public class PrintThreads {

    private int stock;


    public PrintThreads() {
        stock = 10;
    }

    public void doPrintThreads(){

        Thread t1 = new Thread(() -> {
            System.out.println(stock + " stocks in " + Thread.currentThread().getName());
        });

        t1.setName("StockThread");
        System.out.println("Current thread " + Thread.currentThread().getName());
        t1.start();
    }
}
