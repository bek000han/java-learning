
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class ShoppingCart {
    private Map<String, Item> map;

    public ShoppingCart() {
        this.map = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (!(this.map.containsKey(product))) {
            this.map.put(product, new Item(product, 1, price));
        } else {
            this.map.put(product, new Item(product, this.map.get(product).quanitity() + 1, price));
        }
    }
    
    public int price() {
        int total = 0;
        for (Item item: this.map.values()) {
            total += item.price();
        }
        return total;
    }
    
    public void print() {
        for (Item item: this.map.values()) {
            System.out.println(item);
        } 
    }
}
