
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
public class Stack {
    private ArrayList<String> stacks;

    public Stack() {
        this.stacks = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if (this.stacks.size() == 0){
            return true;
        }
        
        return false;
    }
    
    public void add(String value) {
        this.stacks.add(value);
    }
    
    public ArrayList<String> values() {
        ArrayList<String> items = this.stacks;
        return items;
    }
    
    public String take() {
        int last = this.stacks.size() - 1;
        
        String top = this.stacks.get(last);
        this.stacks.remove(last);
        return top;
    }
    
    
}
