
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class Employees {
    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.list.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        this.list.addAll(peopleToAdd);
    }
    
    public void print() {
        for (Person person: this.list) {
            System.out.println(person);
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.list.iterator();
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation() == education) {
                System.out.println(nextInLine);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
