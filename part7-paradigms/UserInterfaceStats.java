
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class UserInterface {
    private Scanner scanner;
    private Statistics stats;

    public UserInterface(Scanner scanner, Statistics stats) {
        this.scanner = scanner;
        this.stats = stats;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            } else {
                stats.add(input);
            }
        }
        
        System.out.println("Point average (all): " + stats.averageTotal());
        System.out.println("Point average (passing): " + stats.averagePassing());
        System.out.println("Pass percentage: " + stats.passPercentage());
        System.out.println("Grade distribution: ");
        stats.gradeDistroTable();
    }
    
    
}
