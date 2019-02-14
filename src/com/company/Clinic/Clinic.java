package com.company.Clinic;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Clinic {

    public static final int QUEUE_LENGTH = 50;

    public static void main(String[] args) {

        Doctor doctor = new Doctor();

        Comparator<Patient> patientComparator = new PatientComparator();
        Queue<Patient> priorityQueue = new PriorityQueue<>(QUEUE_LENGTH, patientComparator);

        for(int i=0;i<QUEUE_LENGTH;i++) {
            // Add patients to queue
            priorityQueue.add(new Patient());
        }

        while(!priorityQueue.isEmpty()) {
            // Increase Wait Time
            for(Patient patient: priorityQueue) patient.increaseWaitTime();

            // See patient
            Patient patientInConsult = priorityQueue.remove();
            doctor.assessPatient(patientInConsult);
        }


    }
}
