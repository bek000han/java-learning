
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        if (translations.containsKey(word)) {
            this.translations.get(word).add(translation);
        } else {
            this.translations.put(word, new ArrayList<>());
            this.translations.get(word).add(translation);
        }
    }
    
    public ArrayList<String> translate(String word) {
        if (this.translations.containsKey(word)) {
            return this.translations.get(word);
        } else {
            return new ArrayList<>();
        }
    }
    
    public void remove(String word) {
        this.translations.remove(word);
    }
}
