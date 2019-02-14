package com.company.GlobalTemperatures;

import java.util.Arrays;

/**
 * Weather Report class that will run as a thread to report Asia-Pacific Weathers
 */
public class WeatherReportPacific implements Runnable {

    private WeatherSubject satellite;
    private static final String[] cities = {"Melbourne", "Singapore", "Shanghai"};
    String cityName;
    double cityTemperature;

    public WeatherReportPacific(WeatherSubject satellite, int startTime,
                                String cityName, double temperature) {
        // Assigning the right WeatherSubject
        this.satellite = satellite;


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

        
    }
}
