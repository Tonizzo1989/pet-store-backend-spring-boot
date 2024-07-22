package it.petstore.repository;

import it.petstore.entity.PetStoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetStoreRepository extends JpaRepository<PetStoreEntity, Integer> {




}
