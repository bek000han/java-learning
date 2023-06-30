
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        while (!(input.equals(""))) {
            String[] text = input.split(" ");
            for (String word: text) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
            input = scanner.nextLine();
        }

    }
}
