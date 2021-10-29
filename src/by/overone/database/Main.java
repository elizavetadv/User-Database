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

        System.out.println();

        System.out.println("ADD:");

        User addedUser = userService.addUser(new User("Elizabeth", "Davidovich", 18, "+375444592051"));
        System.out.println(addedUser);
        User addedUser1 = userService.addUser(new User("Nastya", "Kotobich", 21, "+375444123052"));
        System.out.println(addedUser1);
    }
}
