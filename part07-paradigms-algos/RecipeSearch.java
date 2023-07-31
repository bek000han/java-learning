import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Searcher tool = new Searcher();
        UserInterface ui = new UserInterface(scanner, tool);
        
        ui.start();
    }

}
