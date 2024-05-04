import java.util.ArrayList;

public class Database {
    ArrayList<Person> persons;

    public Database() {
        this.persons = new ArrayList<Person>();
        populateData();
    }

    public void populateData(){
        this.persons.add(new Person("Joel", 25, "M" ));
        this.persons.add(new Person("Satyam", 29, "M" ));
        this.persons.add(new Person("Ruben", 31, "M" ));
        this.persons.add(new Person("Paul", 7, "M" ));
        this.persons.add(new Person("Neha", 7, "F" ));
        this.persons.add(new Person("Kirti", 14, "F" ));
        this.persons.add(new Person("Kirti", 41, "F" ));
        this.persons.add(new Person("Sharad", 25, "M" ));
        this.persons.add(new Person("Abhishek", 7, "M" ));
        this.persons.add(new Person("Ritu", 20, "F" ));
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

}
