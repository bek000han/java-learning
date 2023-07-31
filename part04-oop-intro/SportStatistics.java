
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Name: ");
        String name = scan.nextLine();
        int count = 0;
        int win = 0;
        int loss = 0;
        ArrayList<String> games = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                
                if (parts[0].equals(name)) {
                    count++;
                    if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                        win++;
                    } else {
                        loss++;
                    }
                } else if (parts[1].equals(name)) {
                    count++;
                    if (Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])) {
                        win++;
                    } else {
                        loss++;
                    }
                } else {
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
    }

}
