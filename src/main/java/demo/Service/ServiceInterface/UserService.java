package demo.Service.ServiceInterface;

import demo.Entity.User;

import java.util.List;

public interface UserService {
    User getUserById(int id);
    List<User> getAllUser();
    User addUser(User user);
    User updateUser(User user,int id);
    String deleteById(int id);
}
