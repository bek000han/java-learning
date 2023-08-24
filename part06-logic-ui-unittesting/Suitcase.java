
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int weight) {
        this.items = new ArrayList<>();
        this.maxWeight = weight;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }
    
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item " + "(" + this.totalWeight() + " kg)"; 
        } else {
            return this.items.size() + " items " + "(" + this.totalWeight() + " kg)";
        }
    }
    
    public void printItems() {
        for (Item listItem: this.items) {
            System.out.println(listItem);
        } 
    }
    
    public int totalWeight() {
        int total = 0;
        for (Item listItem: this.items) {
            total += listItem.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = new Item("", 0);
        for (Item listItem: this.items) {
            if (listItem.getWeight() > heaviest.getWeight()) {
                heaviest = listItem;
            }
        }
        return heaviest;
    }
}
