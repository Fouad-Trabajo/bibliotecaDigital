package com.iesam.digitallibrary.feature.user.data;

import com.iesam.digitallibrary.feature.user.data.local.UserFileLocalDataSource;
import com.iesam.digitallibrary.feature.user.domain.User;
import com.iesam.digitallibrary.feature.user.domain.UserRepository;

import java.util.List;

/**
 * Esta es la clase que me permite gestionar el acceso a fuentes de datos*/
public class UserDataRepository implements UserRepository {

    private UserFileLocalDataSource userFileLocalDataSource;
    @Override
    public void createUser(User user) {

    }

    @Override
    public User getUser(String id) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
