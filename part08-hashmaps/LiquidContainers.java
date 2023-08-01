
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (command.equals("quit")) {
                break;
            } int amount = Integer.valueOf(parts[1]);
            
            
            if (command.equals("add")) {
                if (amount < 0) {
                    continue;
                } else if ((firstContainer + amount >= 100)) {
                    firstContainer = 100;
                } else {
                    firstContainer += amount;
                }
            } else if (command.equals("move")) {
                if (amount < 0) {
                    continue;
                }
                if (amount > 100) {
                    amount = firstContainer;
                }
                if (amount > firstContainer) {
                    amount = firstContainer;
                }
                
                if (secondContainer + amount >= 100) {
                    secondContainer = 100;
                    firstContainer -= amount;
                } else {
                    secondContainer += amount;
                    firstContainer -= amount;
                }
            } else if (command.equals("remove")) {
                if (amount < 0) {
                    continue;
                }
                
                if (secondContainer - amount < 0) {
                    secondContainer = 0;
                } else {
                    secondContainer -= amount;
                }
            } else {
                continue;
            }

        }
    }

}