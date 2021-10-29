package by.overone.database;

import by.overone.database.entity.User;
import by.overone.database.service.UserService;
import by.overone.database.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        User[] users = userService.getAllUsers();

        System.out.println("REMOVE: ");

        User removedUser = userService.removeUserById(10);

        if(removedUser.getId() > 0){
            System.out.println(removedUser);
        } else{
            System.out.println("User is not found");
        }
    }
}
