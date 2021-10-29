package by.overone.database.service;

import by.overone.database.entity.User;

public interface UserService {
    User[] getAllUsers();

    User removeUserById(long id);

    User addUser(User user);

    User getUserById(long id);

    User getUserByFullName(String fullName);
}
