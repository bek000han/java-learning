
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros(), this.cents + addition.cents());
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }
        
        if (this.euros == compared.euros() &&
            this.cents < compared.cents()) {
            return true;
        }
        
        return false;
        // 1.00 -3.50
        // 1.00 1.50
    }
    
    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros();
        int newCents = this.cents - decreaser.cents();
        
        if (newCents < 0) {
            newEuros--;
            newCents = 100 + newCents;
        }
        
        if (newEuros >= 0) {
            return new Money(newEuros, newCents);
        }
        
        return new Money(0, 0);
        
        // 2.50 2.00
        
        // 5.50 - 6.00
        // 6.00 - 5.50
        // 5.00 - 3.50
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
