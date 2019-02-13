package com.company.ZooSituation;

public class Zoo {


    // Singleton just cause
    private static final Zoo ZOO = new Zoo();

    private Zoo(){


    }

    public Zoo createZoo() {
        return ZOO;
    }
}
