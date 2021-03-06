package singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ender on 20/01/15.
 */
public class Client {

    private IMySingleton dbService;

    public static class Person {
        private String name;

        Person(String name) {
            this.name = name;
        }
    }

    public Client(IMySingleton dbService) {
        this.dbService = dbService;
    }

    // Query: ahmet
    // Result: Person[] ahmet
    public Person[] query(String query) {
        String[] result = dbService.query(query);
        List<Person> list = new ArrayList<>();
        for (String s: result) {
            list.add(new Person(s));

        }
        return list.toArray(new Person[list.size()]);
    }

    public static void main(String[] args) {
        new Client(MySingleton.getInstance());
    }

}
