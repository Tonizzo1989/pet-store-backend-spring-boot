package it.petstore.entity;

import jakarta.persistence.*;


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

    @Column
    public String zone;

    @ManyToOne
    public UserEntity owner;


}
