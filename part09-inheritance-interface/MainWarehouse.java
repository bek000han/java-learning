

public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

        // etc

        // and now we have the history:
        System.out.println(juice.history());
    }

}
