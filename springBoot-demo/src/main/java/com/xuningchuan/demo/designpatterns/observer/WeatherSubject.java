package com.xuningchuan.demo.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuningchuan
 * @Title: WeatherSubject  观察者模式
 * @Description:
 * @date 2019/12/5下午2:48
 */
public class WeatherSubject implements Subject {

    /** 温度*/
    private float temperature;

    /** 气压*/
    private float pressure;

    /** 湿度*/
    private float humidity;

    private List<Observer> observers = new ArrayList<>();

    private void weatherDataChange(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer-> observer.update(temperature, pressure, humidity));
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        new ObserverA(weatherSubject);
        new ObserverB(weatherSubject);
        weatherSubject.weatherDataChange(1.0f,2.0f,3.0f);

    }
}
