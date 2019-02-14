package com.company.GlobalTemperatures;

/**
 * Global Temperature Simulation
 * Adapted from Stock Pricing Simulation tutorial for Observer Patterns by Derek Banas
 * (http://www.newthinktank.com/2012/08/observer-design-pattern-tutorial/)
 *
 * Written by Ng Wei How (https://github.com/ngweihow)
 * There are some bugs but I cant be fucked fixing them
 */

import java.util.ArrayList;
import java.util.Arrays;

public class TheWeatherMan {

    public static final int WEATHER_CHECKS = 25;
    private static final String[] PACIFIC_CITIES = { "Singapore", "Melbourne", "Shanghai"};
    private static final int BUFFER = 2;

    public static void main(String[] args) {


        // Only one satellite that is Weather Subject
        Satellite satellite = new Satellite();

        // ----------------------------------------------------------------
        // REQUIRED ONLY FOR SINGLE-THREADED
        // ----------------------------------------------------------------
        // Observers to the satellite
        WeatherStation weatherStation = new WeatherStation(satellite,
                new ArrayList<>(Arrays.asList(PACIFIC_CITIES)));
        // ----------------------------------------------------------------

        // Finding Pacific Cities Weather
        Runnable weatherSingapore = new WeatherReportPacific(
                satellite, BUFFER, "Singapore",30.0);
        Runnable weatherMelbourne = new WeatherReportPacific(
                satellite, BUFFER, "Melbourne", 21.5);
        Runnable weatherShanghai = new WeatherReportPacific(
                satellite, BUFFER, "Shanghai", 7);

        new Thread(weatherSingapore).start();
        new Thread(weatherMelbourne).start();
        new Thread(weatherShanghai).start();
    }


}
