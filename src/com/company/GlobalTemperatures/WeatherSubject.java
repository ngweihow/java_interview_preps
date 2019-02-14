package com.company.GlobalTemperatures;

public interface WeatherSubject {

    void addCity(WeatherObserver weatherObserver);
    void removeCity(WeatherObserver weatherObserver);
    void notifyWeatherObserver();
}
