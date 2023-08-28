
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.add("lol", 5);
        System.out.println(hashmap.get("lol"));
        hashmap.remove("lol");
        System.out.println(hashmap.get("lol"));
    }

}
