package it.petstore.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

public class UserController {

    @PostMapping
    public String create(){
        return "CreateANewUser";
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
    public String getUserByUserName(){
        return "getUserByUserName";
    }

    @DeleteMapping("{id}")
    public String delete(){
        return "deleteUser";
    }

    @PutMapping("{id}")
    public String updateUser(){
        return "UserUpdated";
    }

}
