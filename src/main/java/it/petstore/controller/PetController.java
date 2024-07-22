package it.petstore.controller;

import it.petstore.service.IPetStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pet") //Dominio funzionale! (Argomento principale)
public class PetController {

    @Autowired //Implementiamo una dipendenza per gestire la logica di business
    IPetStoreService petStore;

    //Crea un nuovo pet
    @PostMapping
    public String addNewPet (){
       return petStore.create();

    }
    //Prendi tutti i pet
    @GetMapping
    public String findsPetsStatus(){
        return petStore.getList();
    }

    // Prendi solo un pet specifico
    @GetMapping("{id}")
    public String findsPetsById(){
        return petStore.getSingle();
    }

    //Aggiorna il singolo pet
    @PutMapping("{id}")
    public String updatesAPet(){
        return petStore.update();
    }

}
