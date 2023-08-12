
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
public class Herd implements Movable {
    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
            
    @Override
    public String toString() {
        String positions = "";
        for (Movable unit: this.herd) {
            positions += unit.toString() + "\n";
        }
        return positions;
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable unit: this.herd) {
            unit.move(dx, dy);
        }
    }
    
    
}
