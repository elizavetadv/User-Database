package by.overone.database.utils;

import by.overone.database.entity.User;

public class UserWrapper {

    public static User stringToUser(String userStr) {
        User user = new User();
        String[] properties = userStr.split(", ");

        for (String str : properties) {
            String prop = str.substring(0,str.indexOf(" "));
            switch (prop) {
                case "id:":
                    long id = Long.parseLong(str.substring(4));
                    user.setId(id);
                    break;
                case  "name:":
                    String name = str.substring(5);
                    user.setName(name);
                    break;
                case "surname:":
                    String surname = str.substring(9);
                    user.setSurname(surname);
                    break;
                case "age:":
                    int age = Integer.parseInt(str.substring(5));
                    user.setAge(age);
                    break;
                case  "phoneNumber:":
                    String phoneNumber = str.substring(13);
                    user.setPhoneNumber(phoneNumber);
                    break;
            }

        }

        return user;
    }

    public static String userToString(User user) {
        String str = "id: " + user.getId() + ", name: " + user.getName() + ", surname: " + user.getSurname() +
                ", age: " + user.getAge() + ", phoneNumber: " + user.getPhoneNumber();

        return str;
    }
}
