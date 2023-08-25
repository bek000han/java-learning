
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class Pipe<T> {
    private List<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }
    
    public T takeFromPipe() {
        if (this.pipe.isEmpty()) {
            return null;
        }
        T value = this.pipe.get(0);
        this.pipe.remove(0);
        return value;
    }
    
    public boolean isInPipe() {
        return (this.pipe.size() > 0);
    }
}
