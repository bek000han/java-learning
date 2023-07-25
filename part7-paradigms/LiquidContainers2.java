
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (command.equals("quit")) {
                break;
            } int amount = Integer.valueOf(parts[1]);
            
            
            if (command.equals("add")) {
                firstContainer.add(amount);
            } else if (command.equals("move")) {
                if (amount < 0) {
                    continue;
                }
                if ((amount > 100) ||  (amount > firstContainer.contains())){
                    amount = firstContainer.contains();
                }
                firstContainer.remove(amount);
                secondContainer.add(amount);
                
            } else if (command.equals("remove")) {
                secondContainer.remove(amount);
            } else {
                continue;
            }

        }
    }

}
