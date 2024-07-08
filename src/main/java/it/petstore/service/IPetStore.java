package it.petstore.service;

public interface IPetStore {

    //Implementazione del Crud

     String create();

     String getSingle();

     String getList();

     String update();

     String delete();
}
