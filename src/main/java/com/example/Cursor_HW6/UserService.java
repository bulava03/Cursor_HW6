package com.example.Cursor_HW6;

import java.util.List;

public interface UserService {
    void createUser(User user);

    void deleteUserById(Long id);

    List<User> getAllUsers();

    User getUserById(Long id);

    User getUserByEmail(String email);

    void updateUser(User user);
}
