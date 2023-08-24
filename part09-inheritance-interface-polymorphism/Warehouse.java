
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product) {
        if (prices.containsKey(product)) {
            return this.prices.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product) {
        if (stocks.containsKey(product)) {
            return this.stocks.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product) {
        if (stocks.containsKey(product) && this.stocks.get(product) > 0) {
            this.stocks.put(product, this.stocks.get(product) - 1);
            return true;
        } else {
            return false;
        }
    }
    
    public Set<String> products() {
        Set<String> productNames = new HashSet<>();
        for (String product: this.prices.keySet()) {
            productNames.add(product);
        }
        return productNames;
    }
}
