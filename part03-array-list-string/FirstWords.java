
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        while (!(input.equals(""))) {
            String[] text = input.split(" ");
            System.out.println(text[0]);
            input = scanner.nextLine();
        }

    }
}
