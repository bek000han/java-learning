
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int oldest = 0;
        
        while (!(input.equals(""))) {
            String[] text = input.split(",");
            if (Integer.valueOf(text[1]) > oldest) {
                oldest = Integer.valueOf(text[1]);
            }
            input = scanner.nextLine();
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
