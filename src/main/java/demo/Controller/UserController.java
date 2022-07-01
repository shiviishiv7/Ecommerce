package demo.Controller;


import demo.Entity.User;
import demo.Service.ServiceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
//    {
//        "id":"1",
//        "username":"sid",
//        "password":"sid123",
//        "email":"sid19998@gmail.com",
//        "phoneN":"12121212",
//        "gender":"M"
//}
    @Autowired
    private UserService userService;

    @GetMapping("get-user-by-id/{id}")
    public User getUserById(@PathVariable("id") String id){
        return userService.getUserById(Integer.parseInt(id));
    }

    @GetMapping("get-all-users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping("add-user")
    public User addUser(@RequestBody User user){
        return  userService.addUser(user);
    }

    @PutMapping("update-user-by-id/{id}")
    public User updateUserById(@RequestBody User user,@PathVariable("id") String id){
        return userService.updateUser(user,Integer.parseInt(id));
    }

    @DeleteMapping("delete-user-by-id/{id}")
    public String deleteById(@PathVariable("id")String id){
        return userService.deleteById(Integer.parseInt(id));
    }
}
