package by.overone.database.service.impl;

import by.overone.database.entity.User;
import by.overone.database.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User[] getAllUsers() {
        return new User[0];
    }

    @Override
    public User removeUserById(long id) {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User getUserById(long id) {
        return null;
    }

    @Override
    public User getUserByFullName(String fullName) {
        return null;
    }
}
