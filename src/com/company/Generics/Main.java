package com.company.Generics;

public class Main {

    public static void main(String[] args) {
        GenericObj gen1 = new GenericObj(213);
        GenericObj gen2 = new GenericObj("bus");

        System.out.println(gen1.getT());
        System.out.println(gen2.getT());
    }
}
