package it.petstore.controller;

import it.petstore.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")


public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping
    public String create(){
        return userService.create();
    }

    @GetMapping
    public String logInUser(){
        return "userLogInSystem";
    }

    @GetMapping
    public String logOutUser(){
        return "userLogOutSystem";
    }

    @GetMapping("{id}")
    public String getUserByUserId(){
        return userService.readSingle();
    }

    @DeleteMapping("{id}")
    public String deleteByUserById(){
        return userService.delete();
    }

    @PutMapping("{id}")
    public String updateUser(){
        return userService.update();
    }

    @GetMapping()
    public String readList(){
        return userService.readList();
    }

}
