import java.util.*;
class CustomComparator implements Comparator<Person>{
    public int compare(Person a, Person b){
        if (a.getAge()!=b.getAge()){
            // Sorting in ascending order
            return a.getAge() - b.getAge();
        } else if (a.getGender().compareTo(b.getGender()) != 0) {
            // Sorting in descending order
            return b.getGender().compareTo(a.getGender());
        } else{
            return a.getName().compareTo(b.getName());
        }
    }
}

public class ArrayListCollection {
    public static void main(String[] args) {
        Database db = new Database();
        ArrayList<Person> persons = new ArrayList<Person>();
        // Adding data in ArrayList
        addDataInArrayList(db.getPersons(), persons);
        // Sorting the data in the ArrayList
        sortDataInArrayList(persons);
        // Removing data from the ArrayList with name "Joel"
        removeDataFromArrayList(persons, "Joel");
        // Removing all elements from the ArrayList
        /*
        removeAllEntriesFromArrayList(persons);
         */
        // Printing ArrayList
        printArrayList(persons);

    }

    public static void addDataInArrayList(ArrayList<Person> dbData, ArrayList<Person> persons){
        /*
        // to add objects one by one
        for (Person person : dbData) {
            persons.add(person);
        }
        */
        // to add objects in one shot
        persons.addAll(dbData);
    }

    public static void sortDataInArrayList(ArrayList<Person> persons){
        persons.sort(new CustomComparator());
    }

    public static void removeDataFromArrayList(ArrayList<Person> persons, String name){
        // Remove an element while iterating
        /*
        Iterator<Person> iterator=persons.iterator();
        while (iterator.hasNext()){
            Person current = iterator.next();
            if (current.getName().compareTo("name")==0){
                iterator.remove();
            }
        }
        */

        // Remove using Collection.removeIf
        persons.removeIf(person -> person.getName().compareTo(name) == 0);

    }

    public static void removeAllEntriesFromArrayList(ArrayList<Person> persons){
        persons.clear();
    }

    public static void printArrayList(ArrayList<Person> persons){
        printTotalSize(persons);
        for (Person person : persons){
            person.printInfo();
        }
    }

    public static void printTotalSize(ArrayList<Person> persons){
        System.out.println("Total: "+persons.size());
    }
}
