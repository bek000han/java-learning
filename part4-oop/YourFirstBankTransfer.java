
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matacc = new Account("Matthews account", 1000.0);
        Account myacc = new Account("My account", 0.0);
        
        matacc.withdrawal(100.0);
        myacc.deposit(100.0);
        
        System.out.println(matacc);
        System.out.println(myacc);
    }
}
