package by.overone.database.entity;

import by.overone.database.DB;

public class User {
    public static int counter = DB.users.size();

    private long id;
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;

    public User(){

    }

    public User(String name, String surname, int age, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }


}
