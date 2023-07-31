
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class Room {
    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty() {
        if (this.people.isEmpty()) {
            return true;
        }        
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }
        
        Person shortestperson = new Person("", 999);
        for (Person person: this.people) {
            if (person.getHeight() < shortestperson.getHeight()) {
                shortestperson = person;
            }
        }
        return shortestperson;
    }
    
    public Person take() {
        if (this.people.isEmpty()) {
            return null;
        }
        
        Person shortestperson = new Person("", 999);
        for (Person person: this.people) {
            if (person.getHeight() < shortestperson.getHeight()) {
                shortestperson = person;
            }
        }
        this.people.remove(shortestperson);
        return shortestperson;
    }
}
