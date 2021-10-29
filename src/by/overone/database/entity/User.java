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

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        User.counter = counter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User(" +
                "id=" + id +
                ", name=" + name +
                ", surname=" + surname +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ')';
    }
}
