
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int output;
        
        while (true) {            
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                System.out.println(Integer.valueOf(input) * Integer.valueOf(input) * Integer.valueOf(input));
            }
        }
    }
}
