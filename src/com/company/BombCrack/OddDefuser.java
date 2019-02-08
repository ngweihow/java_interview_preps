package com.company.BombCrack;

public class OddDefuser extends Defuser {

    public OddDefuser(Bomb bomb){
        super(bomb);
    }

    @Override
    public void run() {
        for(int i=0;i<Main.MAX_PW;i+=2){

            // If correct attempt
            if(bomb.defuse(i)) {
                System.out.println("BOMB DEFUSED BY " + this.getName());
                System.exit(0);
            }
        }
    }
}
