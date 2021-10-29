package by.overone.database.service.impl;

import by.overone.database.DB;
import by.overone.database.entity.User;
import by.overone.database.repository.UserRepository;
import by.overone.database.repository.impl.UserRepositoryImpl;
import by.overone.database.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public User[] getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User removeUserById(long id) {
        User[] users = getAllUsers();
        for (User user : users) {
            if (user.getId() == id) {
                return userRepository.removeUserById(id);
            }
        }
        return new User();
    }

    @Override
    public User addUser(User user) {
        return userRepository.addUser(user);
    }

    @Override
    public User getUserById(long id) {
        if(id <= DB.users.size()) {
            return userRepository.getUserById(id);
        }
        else{
            return null;
        }
    }

    @Override
    public User getUserByFullName(String fullName) {
        return userRepository.getUserByFullName(fullName);
    }
}
