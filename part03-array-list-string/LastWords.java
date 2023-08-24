
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        while (!(input.equals(""))) {
            String[] text = input.split(" ");
            System.out.println(text[text.length - 1]);
            input = scanner.nextLine();
        }

    }
}
