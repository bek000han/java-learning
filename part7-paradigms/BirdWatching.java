
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class BirdWatching {
    private ArrayList<Bird> list;

    public BirdWatching() {
        this.list = new ArrayList<>();
    }
    
    public void addBird(String name, String latin) {
        this.list.add(new Bird(name, latin));
    }
    
    public void addObservationTool(String name) {
        for (Bird bird: list) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void printAll() {
        for (Bird bird: list) {
            System.out.println(bird);
        }
    }
    
    public void printOne(String name) {
        for (Bird bird: list) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }
}
