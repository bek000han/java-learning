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
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }
    
    @Override
    public void add(Item item) {
        int totalWeight = 0;
        for (Item i: this.items) {
            totalWeight += i.getWeight();
        }
        if ((totalWeight + item.getWeight()) <= capacity) {
            this.items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        } else {
            return false;
        }
    }
}
