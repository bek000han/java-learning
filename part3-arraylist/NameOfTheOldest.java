
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int oldest = 0;
        String oldestname = "";
        
        while (!(input.equals(""))) {
            String[] text = input.split(",");
            if (Integer.valueOf(text[1]) > oldest) {
                oldest = Integer.valueOf(text[1]);
                oldestname = text[0];
            }
            input = scanner.nextLine();
        }
        System.out.println("Name of the oldest: " + oldestname);

    }
}
