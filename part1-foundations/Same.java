
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Give the first string:");
        String string1 = scan.nextLine();
        System.out.println("Give the second string:");
        String string2 = scan.nextLine();
        
        if (string1.equals(string2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
