package lesson6;

import java.util.Arrays;
import java.util.HashSet;

public class Ex001 {
    public static void main(String[] args) {

        Worker w1 = new Worker();
        w1.id = 10000;
        w1.salary = 120000;
        w1.name = "Ekaterina";
        w1.lastname = "Bildina";

        Worker w2 = new Worker();
        w2.id = 20000;
        w2.salary = 100000;
        w2.name = "Name";
        w2.lastname = "LastName";

        System.out.println(w1.toString());
        System.out.println(w2.toString());
        var workers = new HashSet<Worker>(Arrays.asList(w1,w2));
        System.out.println(workers.contains(w2));
    }
}
