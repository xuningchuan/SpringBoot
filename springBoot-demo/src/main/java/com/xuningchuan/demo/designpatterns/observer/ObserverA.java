package com.xuningchuan.demo.designpatterns.observer;

/**
 * @author xuningchuan
 * @Title: ObserverA
 * @Description:
 * @date 2019/12/5下午2:35
 */
public class ObserverA extends Observer {

    /** 温度*/
    private float temperature;

    /** 气压*/
    private float pressure;

    /** 湿度*/
    private float humidity;

    ObserverA(Subject subject){
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
          this.temperature = temperature;
          this.pressure = pressure;
          this.humidity = humidity;
          this.display(temperature, pressure, humidity);
    }

    @Override
    public void display(float temperature, float pressure, float humidity) {
        System.out.println("*********ObserverA********");
        System.out.print("温度:" + temperature);
        System.out.print("  气压:" + pressure);
        System.out.println("  湿度:" + humidity);
    }


}
