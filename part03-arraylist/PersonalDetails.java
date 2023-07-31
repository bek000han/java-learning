
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0, sum = 0;
        String longest = "";
        
        while (!(input.equals(""))) {
            String[] text = input.split(",");
            if (text[0].length() > longest.length()) {
                longest = text[0];
            }
            sum += Integer.valueOf(text[1]);
            count++;
            
            input = scanner.nextLine();
        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }
}
