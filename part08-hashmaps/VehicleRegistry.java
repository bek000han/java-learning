import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> hash;

    public VehicleRegistry() {
        this.hash = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.hash.containsKey(licensePlate)) {
            return false;
        } else {
            this.hash.put(licensePlate, owner);
            return true;
        }
    }
    
    public String get(LicensePlate licensePlate) {
        return hash.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.hash.containsKey(licensePlate)) {
            this.hash.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates() {
        for (LicensePlate licensePlate: this.hash.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> printedNames = new ArrayList<>();
        
        for (LicensePlate licensePlate: this.hash.keySet()) {
            String name = this.hash.get(licensePlate);
            if (!printedNames.contains(name)) {
                printedNames.add(name);
                System.out.println(name);
            }
        }
    }
}
