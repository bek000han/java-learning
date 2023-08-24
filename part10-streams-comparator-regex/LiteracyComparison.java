
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv")).forEach(row -> data.add(row));
        } catch (Exception e) {
            System.out.println("Error no file found");
        }
        
        List<String[]> splitData = new ArrayList<>();
        for (String row: data) {
            String[] parts = row.split(",");
            splitData.add(parts);
        }
        
        splitData.stream()
                .sorted((p1,p2) -> {
                    return p1[5].compareTo(p2[5]);
                })
                .forEach(p -> System.out.println(p[3] + " (" + p[4] + ")," + p[2].substring(0, p[2].length() - 4) + ", " + p[5]));
    }
}
