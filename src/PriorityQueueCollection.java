import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class PQCustomComparator implements Comparator<Person> {
    public int compare(Person a, Person b){
        if (a.getAge()!=b.getAge()){
            // Max Heap sorting based on Age
            return b.getAge() - a.getAge();
        } else if (a.getGender().compareTo(b.getGender()) != 0) {
            // Min Heap sorting based on Gender
            return a.getGender().compareTo(b.getGender());
        } else{
            return a.getName().compareTo(b.getName());
        }
    }
}

public class PriorityQueueCollection {
    public static void main(String[] args) {
        Database db = new Database();
        PriorityQueue<Person> persons = new PriorityQueue<Person>(new PQCustomComparator());
        // Adding data in PrioriryQueue
        addDataInArrayList(db.getPersons(), persons);
        // Removing all elements from the ArrayList
        /*
        removeAllEntriesFromPriorityQueue(persons);
        */
        // Printing PriorityQueue
        printPriorityQueue(persons);

    }

    public static void addDataInArrayList(ArrayList<Person> dbData, PriorityQueue<Person> persons){
        /*
        // to add objects one by one
        for (Person person: dbData){
            persons.offer(person);
        }
        */
        // to add objects in one shot
        persons.addAll(dbData);
    }

    public static void removeAllEntriesFromPriorityQueue(PriorityQueue<Person> persons){
        persons.clear();
    }

    public static void printPriorityQueue(PriorityQueue<Person> persons){
        while(!persons.isEmpty()){
            Person person = persons.poll();
            person.printInfo();
        }
    }
}
