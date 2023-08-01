
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            } else if (input > 0) {
                sum += input;
                count++;
            } else {
                continue;
            }
        }
        
        
        if (count > 0) {
            System.out.println(sum / (1.0 * count));
        } else {
            System.out.println("Cannot calculate the average");
        }
        
    }
}
