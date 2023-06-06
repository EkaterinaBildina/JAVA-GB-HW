package javaOOP03;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Ivan", "Petrov", 25))
                .addUser(new User("Nikolay", "Nikolaev", 27))
                .addUser(new User("Ekaterina", "Kirienko", 18))
                .addUser(new User("Nikolay", "Petrov", 24))
                .addUser(new User("Elena", "Petrova", 37))
                .addUser(new User("Nikolay", "Nikolaev", 49));
        ;

        for (User user : personal) {
            System.out.println(user);
        }

        List<User> users = personal.getUsers();
        Collections.sort(users);
        System.out.println("-------------");


        for (User user : personal) {
            System.out.println(user);
        }

        User bigBoss = new User("Elena", "Korotkova", 40);
        bigBoss.setPersonal(personal);

        User littleBoss = new User("Marina", "Romanova", 31);
        personal.addUser(littleBoss);
        littleBoss.setPersonal(new Personal().addUser(new User("Olga", "Vasilyeva", 28)));


        System.out.println("*********");
        Company company = new Company(bigBoss);
        for (User user : company) {
            System.out.println(user);

        }

    }
}
