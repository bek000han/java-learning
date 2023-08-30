
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random random = new Random();
        int number = 0;
        // Implement the random number generation here
        // the method containsNumber is probably useful
        for (int i = 0; i < 7; i++) {
            while (true) {
                number = random.nextInt(40) + 1;
                if (!containsNumber(number)) {
                    this.numbers.add(number);
                    break;
                }
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
    }
}

