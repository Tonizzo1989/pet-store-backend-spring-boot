package it.petstore.controller;

import it.petstore.service.IPetStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pet")
public class PetStoreController {

    @Autowired IPetStore petStore;

    @PostMapping
    public String addNewPet (){
       return petStore.create();

    }

    @GetMapping
    public String findsPetsStatus(){
        return petStore.getList();
    }

    @GetMapping
    public String findsPetsByTags(){
        return petStore.getSingle();
    }

    @GetMapping
    public String findsPetsById(){
        return petStore.getSingle();
    }

    @PostMapping
    public String updatesAPet(){
        return petStore.update();
    }



}
