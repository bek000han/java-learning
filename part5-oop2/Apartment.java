    
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return squares;
    }

    public int getRooms() {
        return rooms;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int totalOne = this.princePerSquare * this.squares;
        int totalTwo = compared.getPrincePerSquare() * compared.getSquares();
        return Math.abs(totalOne - totalTwo);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int totalOne = this.princePerSquare * this.squares;
        int totalTwo = compared.getPrincePerSquare() * compared.getSquares();
        
        if (totalOne > totalTwo) {
            return true;
        }
        return false;
    }

}
