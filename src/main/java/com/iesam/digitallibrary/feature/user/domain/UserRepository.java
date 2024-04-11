package com.iesam.digitallibrary.feature.user.domain;

import java.util.List;

public interface UserRepository {
    void createUser(User user);

    User getUser(String id);

    List<User> getUsers();
}
