
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> totals = new ArrayList<>();
        int total = 0;
        
        for (int i = 0; i < square[0].length; i++) {
            for (int  j = 0; j < square.length; j++) {
                total += square[j][i];
            }
            totals.add(total);
            total = 0;
        }
        return totals;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> totals = new ArrayList<>();
        int total = 0;
        
        for (int i = 0; i < square.length; i++) {
            for (int  j = 0; j < square[0].length; j++) {
                total += square[i][j];
            }
            totals.add(total);
            total = 0;
        }
        return totals;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> totals = new ArrayList<>();
        int lastIndex = square[0].length - 1;
        int totalLeft = 0;
        int totalRight = 0;
        int col = 0;
        
        for (int i = 0; i < square.length; i++) {
            totalLeft += square[i][col];
            totalRight += square[i][lastIndex - col];
            col++;
        }
        totals.add(totalLeft);
        totals.add(totalRight);
        
        return totals;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || y >= getWidth() || x >= getHeight()) {
            return - 1;
        }

        return this.square[x][y];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[x][y] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
