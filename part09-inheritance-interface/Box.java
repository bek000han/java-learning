
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
public class Box implements Packable {
    private ArrayList<Packable> items;
    private double maxWeight;

    public Box(double maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void add(Packable toAdd) {
        double totalWeight = weight();
        if (!(totalWeight + toAdd.weight() > maxWeight)) {
            this.items.add(toAdd);
        } 
    }
    
    public double weight() {
        double totalWeight = 0;
        for (Packable item: items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }
    
    public String toString() {
        return "Box: " + this.items.size() + " items, " + "total weight " + weight() + " kg";
    }
}
