
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int centre = size / 2;
        if (size == 2) {
            centre = 0;
        }
        square.placeValue(0, centre, 1);
        int count = size * size;
        int lastIndex = size - 1;
        int value = 2;
        int x = 0;
        int y = size / 2;
        
        for (int i = 1; i < count; i++) {
            int[] loc = moveSiam(x, y, lastIndex);
            if (square.readValue(loc[0], loc[1]) == 0) {
                x = loc[0]; y = loc[1];
                square.placeValue(x, y, value);
                value++;
            } else {
                x = moveDown(x, lastIndex);
                square.placeValue(x, y, value);
                value++;
            }
        }
        return square;
    }
    
    private int [] moveSiam(int x, int y, int lastIndex) {
        x -= 1;
        y += 1;
        if (x < 0) {
            x = lastIndex;
        } 
        if (y > lastIndex) {
            y = 0;
        }
        return new int[] {x, y};
    }
    
    private int moveDown(int x, int lastIndex) {
        x += 1;
        if (x > lastIndex) {
            x = 0;
        }
        return x;
    }
}
