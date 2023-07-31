
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
    private BirdWatching tool;

    public UserInterface(Scanner scanner, BirdWatching tool) {
        this.scanner = scanner;
        this.tool = tool;
    }
    
    public void start() {
        while(true) {
            System.out.println("?");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latin = scanner.nextLine();
                this.tool.addBird(name, latin);
            } else if (command.equals("Observation")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                this.tool.addObservationTool(name);
            } else if (command.equals("All")) {
                this.tool.printAll();
            } else if (command.equals("One")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                this.tool.printOne(name);
            } else {
                continue;
            }
        }
    }
}
