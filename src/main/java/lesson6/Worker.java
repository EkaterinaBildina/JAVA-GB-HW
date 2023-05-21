package lesson6;

public class Worker {

        int id;
        int salary;
        String name;
        String lastname;

        public String toString(){
               return String.format("id:%d fn:%s ln:%s s:%d", id, name, lastname, salary);
        }

}
