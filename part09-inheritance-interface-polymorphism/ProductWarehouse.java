/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class ProductWarehouse extends Warehouse {
    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }
    
    public String getName() {
        return this.productName;
    }
    
    public void setName(String name) {
        this.productName = name;
    }
    
    @Override
    public String toString() {
        return this.productName + ": " + super.toString();
    }
}
