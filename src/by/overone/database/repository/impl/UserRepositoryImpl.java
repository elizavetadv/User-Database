package by.overone.database.repository.impl;

import by.overone.database.DB;
import by.overone.database.entity.User;
import by.overone.database.repository.UserRepository;
import by.overone.database.utils.UserWrapper;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public User[] getAllUsers() {
        List<User> users = new ArrayList<>();
        for (String strUser: DB.users){
            users.add(UserWrapper.stringToUser(strUser));
        }
        return users.toArray(users.toArray(new User[0]));
    }

    @Override
    public User getUserById(long id) {
        boolean f = false;
        String idProp = "id: " + id + ",";

        for (String strUser: DB.users) {

            if(strUser == null){
                f = true;
                continue;
            }

            if (strUser.startsWith(idProp)) {
                return UserWrapper.stringToUser(strUser);
            }

        }

        if(f){
            return null;
        }

        return new User();
    }

    @Override
    public User getUserByFullName(String fullName) {
        String[] FI = fullName.split(" ");
        String idProp = "name: " + FI[0] + ", surname: " + FI[1] + ",";

        boolean f = false;

        for (String strUser: DB.users) {

            if(strUser == null){
                f = true;
                continue;
            }

            int index = strUser.indexOf("name");

            if (strUser.startsWith(idProp, index)) {
                return UserWrapper.stringToUser(strUser);
            }

        }

        if(f){
            return null;
        }

        return new User();
    }

    @Override
    public User removeUserById(long id) {
        String idProp = "id: " + id + ",";
        for(int i = 0; i < DB.users.size(); i++){
            String strUser = DB.users.get(i);
            if(strUser.startsWith(idProp)){
                DB.users.remove(strUser);
                DB.users.add(i, null);
                return UserWrapper.stringToUser(strUser);
            }
        }
        return new User();
    }

    @Override
    public User addUser(User user) {
        User.counter ++;

        user.setId(User.counter);

        DB.users.add(UserWrapper.userToString(user));

        return user;
    }
}
