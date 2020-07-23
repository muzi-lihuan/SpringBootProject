package com.example.SpringBootProject.controller;

import com.example.SpringBootProject.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author ganchaoyang
 * @date 2019/3/1013:55
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/find")
    public User findById() {
        User user = new User();
        user.setName("lisi");
        user.setAddress("科技二路");
        return user;
    }
}
