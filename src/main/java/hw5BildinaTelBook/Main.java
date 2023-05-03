package hw5BildinaTelBook;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        addContact(phoneBook);
        phoneBook.showAllGroups();

        //searchByGroup(phoneBook,"Друзья");

        String name = String.valueOf(phoneBook.searchContact("Анна Крутова"));
        System.out.println(name);

    }

    public static void addContact(PhoneBook phoneBook) {
        phoneBook.addContactToGroup(new ContactList("Иван Иванов", "8985-756-44-14"), "Семья");
        phoneBook.addContactToGroup(new ContactList("Светлана Петрова", "8916-176-93-47"), "Семья");
        phoneBook.addContactToGroup(new ContactList("Кристина Белова", "8947-741-32-11"), "Друзья");
        phoneBook.addContactToGroup(new ContactList("Анна Мусина", "8800-413-74-33"), "Работа");
        phoneBook.addContactToGroup(new ContactList("Анна Крутова", "8811-466-17-32"), "Работа");
        phoneBook.addContactToGroup(new ContactList("Анна Крутова", "8917-000-00-15"), "Друзья");
        phoneBook.addContactToGroup(new ContactList("Иван Юрин", "8984-784-22-34"), "Друзья");
        phoneBook.addContactToGroup(new ContactList("Петр Лыков", "8913-479-81-22"), "Семья");
        phoneBook.addContactToGroup(new ContactList("Павел Чернов", "8946-791-33-74"), "Работа");
        phoneBook.addContactToGroup(new ContactList("Петр Чернышов", "8947-762-77-00"), "Работа");
        phoneBook.addContactToGroup(new ContactList("Мария Федорова", "8971-000-41-11"), "Друзья");
        phoneBook.addContactToGroup(new ContactList("Марина Светлова", "8947-744-14-03"), "Работа");
        phoneBook.addContactToGroup(new ContactList("Мария Савина", "8916-177-63-47"), "Работа");
        phoneBook.addContactToGroup(new ContactList("Мария Рыкова", "8916-174-36-21"), "Работа");
        phoneBook.addContactToGroup(new ContactList("Марина Лугова", "8946-744-21-89"), "Работа");
        phoneBook.addContactToGroup(new ContactList("Анна Владимирова", "8971-744-32-01"), "Работа");
        phoneBook.addContactToGroup(new ContactList("Иван Мечников", "8913-744-85-32"), "Работа");
        phoneBook.addContactToGroup(new ContactList("Петр Петин", "8946-775-78-11"), "Друзья");
        phoneBook.addContactToGroup(new ContactList("Иван Ежов", "8916-177-85-12"), "Семья");

    }

    public static void searchByGroup(PhoneBook phoneBook, String group) {
        List<ContactList> list = phoneBook.searchGroup(group);
        int i = 1;
        try {
            for (ContactList contact : list) {
                System.out.println(i + "." + contact);
                i++;
            }
        } catch (NullPointerException e) {
            System.out.println("Данной группы нет в списке");
        }
    }

}
