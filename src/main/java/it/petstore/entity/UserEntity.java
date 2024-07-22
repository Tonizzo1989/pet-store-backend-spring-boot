package it.petstore.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "UserEntity")
public class UserEntity {


    @Id
    public String id;

    @Column
    public String name;

    @Column
    public  String surname;

    @Column
    public String address;

    @OneToMany
    public List<PetStoreEntity> pets;

}
