/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RM
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        if ((this.sensors.stream().filter(data -> data.isOn()).count()) == this.sensors.size()) {
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        for (Sensor sensor: this.sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor: this.sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException();
        } else {
            double average = this.sensors.stream()
                    .mapToInt(value -> value.read())
                    .average()
                    .getAsDouble();
            this.readings.add((int)average);
            return (int)average;
        }  
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
}
