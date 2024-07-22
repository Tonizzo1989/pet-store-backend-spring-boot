package it.petstore.controller;

import org.apache.catalina.Store;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/store")

public class StoreController {

    @GetMapping
    public String getList(){
        return "getListSingleStore";

    }

    @PostMapping
    public String create(){
        return "CreateASingleStore";
    }

    @GetMapping("{id}")
    public String getSingle(){
        return "getSingleStore";
    }

    @DeleteMapping("{id}")
        public String delete(){
            return "DeleteSingleStoreById";
        }
    }

