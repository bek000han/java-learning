
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
public class Abbreviations {
    private HashMap<String, String> map;

    public Abbreviations() {
        this.map = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.map.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if (this.map.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String findExplanationFor(String abbreviation) {
        if (hasAbbreviation(abbreviation)) {
            return this.map.get(abbreviation);
        } else {
            return null;
        }
    }
}
