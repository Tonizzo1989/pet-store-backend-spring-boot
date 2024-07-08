package it.petstore.service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "PetStore")
public class PetStoreEntity {

    @Id
    public String id;

    @Column
    public String race;

    @Column
    public String fur;

    @Column
    public String age;


}
