package com.company.Clinic;

import java.util.Random;

public class Doctor {
    private int doctorID;

    public Doctor(){
        this.doctorID = new Random().nextInt();

    }

    public void assessPatient(Patient patient){
        System.out.println("Seeing Patient " + patient.getPatientID() +" ...");

        if(patient.isAngry()) {
            System.out.println("Calm down first!");
        }

        if(patient.getDamage() > 80) {
            System.out.println("Wow that's a lot of damage!");
        }

        System.out.println(".\n.\n.\nAll fixed up!\n-----------------------------------------------------");
    }
}
