package by.overone.database.repository;

import by.overone.database.entity.User;

public interface UserRepository {

    User[] getAllUsers();

    User getUserById(long id);

    User getUserByFullName(String fullName);

    User removeUserById(long id);

    User addUser(User user);
}
