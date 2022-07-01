package demo.Service.ServiceImplementation;

import demo.Entity.User;
import demo.Service.ServiceInterface.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImMemoryImplementation implements UserService {
    List<User>userList = new ArrayList<>();

    @Override
    public User getUserById(int id) {
        User user1 = userList.stream().filter(user -> user.getId() == id).findFirst().get();
        return user1;
    }

    @Override
    public List<User> getAllUser() {
        return userList;
    }

    @Override
    public User addUser(User user) {
        userList.add(user);
        return user;
    }

    @Override
    public User updateUser(User user, int id) {
        for (User u:userList){
            if(u.getId()==id){
                u.setEmail(user.getEmail());
                u.setGender(user.getGender());
                u.setPassword(user.getPassword());
                u.setPhoneN(user.getPhoneN());
                u.setUsername(user.getUsername());
                break;
            }
        }
        return user;
    }

    @Override
    public String deleteById(int id) {
        List<User> collect = this.userList.stream().filter(user -> user.getId() !=id).collect(Collectors.toList());
        this.userList = collect;
        return "User has been deleted";
    }
}
