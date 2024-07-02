package it.petstore.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pet")
public class PetStoreController {

    @PostMapping
    public String addNewPet (){
        return "Called method AddNewPet";

    }



}
