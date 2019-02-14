package com.company.GlobalTemperatures;

import java.util.ArrayList;
import java.util.List;

public class Satellite implements WeatherSubject{

    // List of all observers
    private List<WeatherObserver> stations;

    // Weathers
    private double weather1, weather2, weather3;


    /**
     * Creating a list of stations getting weather info from the satellite
     */
    public Satellite(){
        this.stations = new ArrayList<>();
    }


    @Override
    public void addCity(WeatherObserver weatherObserver) {
        stations.add(weatherObserver);
    }

    @Override
    public void removeCity(WeatherObserver weatherObserver) {
        stations.remove(weatherObserver);
    }

    @Override
    public void notifyWeatherObserver() {
        for(WeatherObserver station: stations ) {
            station.update(weather1, weather2, weather3);
        }
    }


    /**
     * Notifying the Observers when each weather changes
     */
    public void setWeather1(double weather1){
        this.weather1 = weather1;

        notifyWeatherObserver();
    }

    public void setWeather2(double weather2){
        this.weather2 = weather2;

        notifyWeatherObserver();
    }

    public void setWeather3(double weather3) {
        this.weather3 = weather3;

        notifyWeatherObserver();
    }
}
