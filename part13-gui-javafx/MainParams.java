package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserTitle app = new UserTitle();
        System.out.println("Give a title");
        String title = "--title=" + scanner.nextLine();
        
        Application.launch(UserTitle.class, title);
    }

}
