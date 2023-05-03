package homework5;

import com.sun.jdi.Value;

import java.util.*;

public class tempHashMap {
    public static void main(String[] args) {

        TreeMap<String, Person> phoneBook = new TreeMap<>();


        phoneBook.put("name1", new Person("8-898-848-00-41", "8-898-848-00-00"));
        phoneBook.put("name2", new Person("8-898-848-00-01", ""));
        phoneBook.put("name3", new Person("8-898-848-00-43", ""));
        phoneBook.put("name4", new Person("8-898-848-00-44", "8-898-848-00-55"));

        //System.out.println(phoneBook);

        for (String key : phoneBook.keySet()) {
            System.out.println("Key: " + key + ", Value: " + phoneBook.get(key));
        }

    }
}



