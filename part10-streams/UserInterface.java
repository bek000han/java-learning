
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class UserInterface {
    private Scanner scanner;
    private List<Book> books;

    public UserInterface(Scanner scanner, List<Book> books) {
        this.scanner = scanner;
        this.books = books;
    }
    
    public void start() {
        while(true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            
            this.books.add(new Book(name, age));
            System.out.println("");
        }
        
        System.out.println(this.books.size() + " books in total.\n");
        System.out.println("Books:");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        
        for (Book book: books) {
            System.out.println(book);
        }
    }
}
