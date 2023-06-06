package javaOOP03;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("firstName: %s, lastName: %s, age: %d", firstName, lastName, age);
    }

    @Override
    public int compareTo(User o) {
        //  int result = 0;

        int firstNameCompareTo = this.firstName.compareTo(o.firstName);
        if (firstNameCompareTo != 0) {
            return firstNameCompareTo;
        }

        int lastNameCompareTo = this.lastName.compareTo(o.lastName);
        if (lastNameCompareTo != 0) {
            return lastNameCompareTo;
        }
        return this.age - o.age;


        // if (this.firstName.compareTo(o.firstName) == 0) {
        //   if (this.lastName.compareTo(o.lastName) == 0) {
        //       return o.age - this.age;
        //   } else {
        //        return this.lastName.compareTo(o.lastName);
        //   }
        //  } else {
        //    this.firstName.compareTo(o.firstName);
        //}


    }

    //if (this.age > o.age) {
    //    return -1;
    //}
    //if (this.age == o.age) {
    //    return 0;
    //} else {
    //    return 1;
    //}

    private Personal personal;

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal() {
        return personal;
    }

}

