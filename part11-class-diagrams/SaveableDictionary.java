/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author RM
 */
public class SaveableDictionary {
    private Map<String, String> dict;
    private String file;

    public SaveableDictionary() {
        this.dict = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.dict = new HashMap<>();
        this.file = file;
    }
    
    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
            for (String key: this.dict.keySet()) {
                writer.println(key + ":" + this.dict.get(key));
            }
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public void add(String words, String translation) {
        if (!this.dict.containsKey(words)) {
            this.dict.put(words, translation);
        }
    }
    
    public String translate(String word) {
        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
        } else if (this.dict.containsValue(word)) {
            for (String key: this.dict.keySet()) {
                if (this.dict.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }
    
    public void delete(String word) {    
        if (this.dict.containsKey(word)) {
            this.dict.remove(word);
        } else if (this.dict.containsValue(word)) {
            String keyToRemove = null;
            for (String key: this.dict.keySet()) {
                if (this.dict.get(key).equals(word)) {
                    keyToRemove = key;
                }
            } this.dict.remove(keyToRemove);
        }
    }
}
