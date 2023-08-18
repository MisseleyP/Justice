package com.example.jwtexample.Controller;
import com.example.jwtexample.Entity.User;
import com.example.jwtexample.Service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

//    @PostConstruct
//    public void initRoleAndUsers() {
//        userService.initRoleAndUser();
//    }
    @PostMapping({"/registerNewUser"})
    public User RegisterNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }

}






