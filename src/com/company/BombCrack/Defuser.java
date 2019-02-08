package com.company.BombCrack;

public abstract class Defuser extends Thread{

    Bomb bomb;

    public Defuser(Bomb bomb) {
        this.bomb = bomb;
        this.setName(this.getClass().getSimpleName());
        this.setPriority(MAX_PRIORITY);
    }

    @Override
    public void start(){
        System.out.println("Defuser " + this.getName() + " is defusing...");
        super.start();
    }
}
