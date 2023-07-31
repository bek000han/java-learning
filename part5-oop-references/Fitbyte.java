/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class Fitbyte {
    private int age;
    private int rhr;
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.rhr = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maximum = 206.3 - (0.711 * age);
        return (maximum - this.rhr) * (percentageOfMaximum) + rhr;
    }
}
