import com.sun.jdi.FloatValue;
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class Statistics {
    private ArrayList<Integer> data;
    private ArrayList<Integer> passingGrades;
    private ArrayList<Integer> gradeDistro;

    public Statistics() {
        this.data = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
        this.gradeDistro = new ArrayList<>();
    }
    
    public void add(int number) {
        if (number >= 0 && number <= 100) {
            this.data.add(number);
        }
        if (number >= 50 && number <= 100) {
            this.passingGrades.add(number);
        }
        
        if (number >= 0 && number <= 100) {
            this.gradeDistro.add(determineGrade(number));
        }
    }
    
    public float averageTotal() {
        int sum = 0;
        float count = 0;
        
        for (int number: this.data) {
            sum += number;
            count++;
        }
        
        return sum / count;
    }
    
    public String averagePassing() {
        if (this.passingGrades.isEmpty()) {
            return "-";
        }
        
        int sum = 0;
        float count = 0;
        
        for (int number: this.passingGrades) {
            sum += number;
            count++;
        }
        
        return Float.toString(sum / count);
    }
    
    public int determineGrade(int points) {
        if (points < 50) {
            return 0;
        } else if (points < 60) {
            return 1;
        } else if (points < 70) {
            return 2;
        } else if (points < 80) {
            return 3;
        } else if (points < 90) {
            return 4;
        } else {
            return 5;
        }
    }
    
    public void gradeDistroTable() {
        for (int i = 5; i >= 0; i--) {
            int count = 0;
            for (int grade: this.gradeDistro) {
                if (grade == i) {
                    count++;
                }
            }
            String stars = "";
            for (int j = 0; j < count; j++) {
                stars += "*";
            }
            System.out.println(i + ": " + stars);
        }
    }
    
    public float passPercentage() {
        return 100 * this.passingGrades.size() / (float) this.data.size();
    }
    
}
