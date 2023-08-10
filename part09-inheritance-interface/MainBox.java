

public class Main {

    public static void main(String[] args) {
        // You can test your program here
        Box box = new BoxWithMaxWeight(5);
        box.add(new Item("a", 1));
        box.add(new Item("b", 2));
        box.add(new Item("c", 2));
        box.add(new Item("d", 1));
        box.add(new Item("f", 0));
        System.out.println(box.isInBox(new Item("d")));
    }
}
