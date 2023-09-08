package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application{
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        HBox labels = new HBox();
        labels.setSpacing(10);
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");
        labels.getChildren().addAll(letters, words, longestWord);
        
        TextArea text = new TextArea();
        text.textProperty().addListener((change, oldValue, newValue) -> {
            int chars = newValue.length();
            String[] wordsText = newValue.split(" ");
            String longest = "";
            for (String word: wordsText) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
            
            letters.setText("Letters: " + String.valueOf(chars));
            words.setText(String.valueOf("Words: " + wordsText.length));
            longestWord.setText("The longest word is: " + longest);
        });
        
        layout.setBottom(labels);
        layout.setCenter(text);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
