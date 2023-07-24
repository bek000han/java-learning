/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author RM
 */
public class UserInterface {
    private JokeManager joker;
    private Scanner scanner;

    public UserInterface(JokeManager joker, Scanner scanner) {
        this.joker = joker;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            
            if (command.equals("x") || command.equals("X")) {
                break;
            } else if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.joker.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println(this.joker.drawJoke());
            } else if (command.equals("3")) {
                this.joker.printJokes();
            } else {
                System.out.println("Error");
            }
            
        }
    }
}
