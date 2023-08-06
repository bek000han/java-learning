
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> map = new HashMap<>();
        map.put("matt", "matthew");
        map.put("mix", "michael");
        map.put("artie", "arthur");
        
        System.out.println(map.get("matt"));
    }

}
