package com.company.GlobalTemperatures;

import java.util.List;

public class WeatherStation implements WeatherObserver {

    private WeatherSubject satellite;
    private double weather1, weather2, weather3;
    private List<String> cities;
    private static int cityID = 0;

    public WeatherStation(WeatherSubject satellite, List<String> cities) {
        this.satellite = satellite;
        this.cities = cities;

        // Double check if ID of city exists in cities list
        if(cityID < cities.size()){
            System.out.println("New Weather Station Registered: " + cities.get(cityID));
        } else {
            System.out.println("Invalid Weather Station Detected!");
            System.exit(1);
        }

        // Register City in the Satellite
        satellite.addCity(this);
    }

    @Override
    public void update(double weather1, double weather2, double weather3){
        this.weather1 = weather1;
        this.weather2 = weather2;
        this.weather3 = weather3;

        printWeather();
    }

    /**
     * Printing Weather Data for Temperatures
     */
    public void printWeather(){
        try {
            System.out.println(cities.get(0) + ": " + weather1 + "\n" +
                    cities.get(1) + ": " + weather2 + "\n" +
                    cities.get(2) + ": " + weather3 + "\n"
            );
        } catch(NullPointerException  | IndexOutOfBoundsException e) {
            System.out.println(e.toString() + " detected at weather printing!\nTerminating Program");
            System.exit(1);
        }
    }
}
