
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int num;
        int count = 0;
        try (Scanner scan = new Scanner(Paths.get(file))) {
            // we read all the lines of the file
            while (scan.hasNextLine()) {
                num = Integer.valueOf(scan.nextLine());
                if (num >= lowerBound && num <= upperBound) {
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Numbers: " + count);
    }

}
