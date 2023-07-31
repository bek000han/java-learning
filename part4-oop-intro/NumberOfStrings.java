
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int count = 0;
        
        while (true) { 
            input = scanner.nextLine();
            if  (input.equals("end")) {
                break;
            }
            count++;
        }
        
        System.out.println(count);
    }
}
