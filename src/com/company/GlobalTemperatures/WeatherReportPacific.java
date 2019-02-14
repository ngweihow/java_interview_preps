package com.company.GlobalTemperatures;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

/**
 * Weather Report class that will run as a thread to report Asia-Pacific Weathers
 */
public class WeatherReportPacific implements Runnable {

    private WeatherSubject satellite;
    private static final String[] cities = { "Singapore", "Melbourne", "Shanghai"};
    private String cityName;
    private double cityTemperature;

    // Delay between each session
    private int startTime;

    public WeatherReportPacific(WeatherSubject satellite, int startTime,
                                String cityName, double temperature) {
        // Assigning the right WeatherSubject
        this.satellite = satellite;
        this.startTime = startTime;


        // Checking the city
        if(Arrays.stream(cities).anyMatch(cityName::equals)) {
            this.cityName = cityName;
            cityTemperature = temperature;
        }

        // If city is not valid, kill program
        else {
            System.out.println("Error! Wrong City Requested in Region!\nPlease Check your WeatherMan!" +
                    "\nTerminating Program...");
            System.exit(1);
        }

    }


    @Override
    public void run() {
        // Cycle through the weather checks in a session
        for(int i=0;i<TheWeatherMan.WEATHER_CHECKS; i++) {

            // Have some delay
            try {
                Thread.sleep(1000* startTime);
            } catch (InterruptedException e) {
                System.out.println("『 Weather Report 』 Pacific has gone berserk and cant sleep.\n" +
                        "Terminating Program...");
                System.exit(1);
            }

            /**
             * Handling Different City Temperatures -------------------------------------------
             */


            // Handling Singapore Temperatures
            if(cityName == "Singapore") {

                // Generates a random number between -.3 and .3
                double randNum = (Math.random() * (.6)) - .3;
                // Formats decimals to 2 places
                DecimalFormat df = new DecimalFormat("#.##");

                cityTemperature = Double.valueOf(df.format((cityTemperature + randNum)));
                // Set Temp
                ((Satellite) satellite).setWeather1(cityTemperature);
            }

            // Handling Melbourne Temperatures
            if(cityName == "Melbourne") {
                Random random = new Random();
                double temp = (double) random.nextInt(45) + random.nextDouble();

                cityTemperature = temp;
                // Set Temp
                ((Satellite) satellite).setWeather2(cityTemperature);
            }

            // Handling Shanghai Temperatures
            if(cityName == "Shanghai") {

                // Fluctuate +-5
                Random random = new Random();
                double temp = ((double) random.nextInt(5) +
                        random.nextDouble()) * (random.nextBoolean() ? 1 : -1);


                cityTemperature = cityTemperature + temp;
                // Set Temp
                ((Satellite) satellite).setWeather3(cityTemperature);
            }

        }
    }
}
