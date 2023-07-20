
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
public class Hold {
    private ArrayList<Suitcase> cargo;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.cargo = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int total = 0;
        for (Suitcase listItem: this.cargo) {
            total += listItem.totalWeight();
        }
        
        if (total + suitcase.totalWeight() <= maxWeight) {
            this.cargo.add(suitcase);
        }
    }
    
    public String toString() {
        int total = 0;
        for (Suitcase listItem: this.cargo) {
            total += listItem.totalWeight();
        }
        return this.cargo.size() + " suitcases " + "(" + total + " kg)";
    }
    
    public void printItems() {
        for (Suitcase listItem: this.cargo) {
            listItem.printItems();
        }
    }
}
