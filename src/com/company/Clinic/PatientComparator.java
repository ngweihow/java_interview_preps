package com.company.Clinic;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient>{

    @Override
    public int compare(Patient patient1, Patient patient2) {

        double patient1Multiplier = (patient1.isAngry()) ? 1.5: 1;
        double patient2Multiplier = (patient2.isAngry()) ? 1.5: 1;

        double urgency1 = patient1Multiplier * (patient1.getDamage() + patient1.getWaitTime());
        double urgency2 = patient1Multiplier * (patient2.getDamage() + patient2.getWaitTime());

        if(urgency1 == urgency2) {
            return 0;
        }

        else{
            return (urgency1 > urgency2) ? 1: -1;
        }
    }
}
