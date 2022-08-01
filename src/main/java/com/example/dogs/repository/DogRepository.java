package com.example.dogs.repository;

import com.example.dogs.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DogRepository extends JpaRepository<Dog, Long> {

    @Query("select d.breed from Dog d where d.id = ?1")
    String findBreedById(Long id);

    @Query("select d.breed from Dog d")
    List<String> findAllBreeds();

    @Query("select d.name from Dog d")
    List<String> findAllNames();
}
