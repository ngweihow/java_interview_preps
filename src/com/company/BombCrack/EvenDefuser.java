package com.company.BombCrack;

public class EvenDefuser extends Defuser{

    public EvenDefuser(Bomb bomb) {
        super(bomb);
    }

    @Override
    public void run () {
        for(int i=1;i<Main.MAX_PW;i+=2){

            // If correct attempt
            if(bomb.defuse(i)) {
                System.out.println("BOMB DEFUSED BY " + this.getName());
                System.exit(0);
            }
        }
    }
}
