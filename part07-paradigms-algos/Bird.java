/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class Bird {
    private String name;
    private String latin;
    private int observation;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observation = 0;
    }
    
    public void addObservation() {
        this.observation++;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.latin + "): " + this.observation + " observations"; 
    }
}
