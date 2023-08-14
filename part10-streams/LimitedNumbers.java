
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();
        
        while(true) {
            String row = scanner.nextLine();
            if (0 > Integer.valueOf(row)) {
                break;
            }
            inputs.add(Integer.valueOf(row));
        }
        
        inputs.stream()
                .filter(value -> value >= 1 && value <= 5)
                .forEach(value -> System.out.println(value));
    }
}
