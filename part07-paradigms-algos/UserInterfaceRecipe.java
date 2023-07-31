import java.nio.file.Paths;
import java.util.ArrayList;
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
    private Searcher tool;

    public UserInterface(Scanner scanner, Searcher tool) {
        this.scanner = scanner;
        this.tool = tool;
    }
    
    public void start() {
        System.out.println("File to read:");
        String file = scanner.nextLine();
        System.out.println();
        
        this.tool.readFileIntoList(file);
        
        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\n"
                + "find name - searches recipes by name\nfind cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient\n");
        
        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                this.tool.printRecipes();
                System.out.println();
            } else if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String searched = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes:");
                this.tool.findByName(searched);
                System.out.println();
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int searched = Integer.valueOf(scanner.nextLine());
                System.out.println();
                System.out.println("Recipes:");
                this.tool.findByTime(searched);
                System.out.println();
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String searched = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes:");
                this.tool.findByIngredient(searched);
            }
        }
    }
}
