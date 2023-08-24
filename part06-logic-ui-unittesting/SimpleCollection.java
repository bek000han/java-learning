
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {
            String content = "";
            int count = 0;
            for (String data: this.elements) {
                if (count == this.elements.size() - 1) {
                    content += data;
                } else {
                    content += data + "\n";
                }
                count++;
            }
            
            String word;
            if (this.elements.size() == 1) {
                word = " element:\n";
            } else {
                word = " elements:\n";
            }
            
            return "The collection " + this.name + " has " + count + word + content;
        }
    }
    
}
