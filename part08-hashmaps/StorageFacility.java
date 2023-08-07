
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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        if (storage.containsKey(unit)) {
            this.storage.get(unit).add(item);
        } else {
            this.storage.put(unit, new ArrayList<>());
            this.storage.get(unit).add(item);
        }
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (this.storage.containsKey(storageUnit)) {
            return this.storage.get(storageUnit);
        } else {
            return new ArrayList<>();
        }
    }
    
    public void remove(String storageUnit, String item) {
        this.storage.get(storageUnit).remove(item);
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnitNames = new ArrayList<>();
        
        for (String storageUnit: this.storage.keySet()) {
            if (!this.storage.get(storageUnit).isEmpty()) {
                storageUnitNames.add(storageUnit);
            }
        }
        return storageUnitNames;
    }   
}
