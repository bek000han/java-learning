
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
public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        } else {
            double max = 0;
            for (double status: this.history) {
                if (status > max) {
                    max = status;
                }
            }
            return max;
        }
    }
    
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        } else {
            double min = Double.MAX_VALUE;
            for (double status: this.history) {
                if (status < min) {
                    min = status;
                }
            }
            return min;
        }
    }
    
    public double average() {
        double sum = 0;
        int count = 0;
        for (double status: this.history) {
            sum += status;
            count++;
        }
        return sum / count;
    }
}
