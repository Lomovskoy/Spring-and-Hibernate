package org.app.service;

import java.util.List;
import org.app.domain.User;

public interface IUserService {
    List<User> getAll();
    void updateUser(User user);
    void deleteUser(Long id);
    void addUser(User user);
    
}
