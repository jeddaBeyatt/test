package com.example.dogs.service;


import com.example.dogs.entity.Dog;

import java.util.List;

public interface DogService {

    List<Dog> retrieveDogs();
    List<String>  retrieveDogBreed();
    String retrieveDogBreedByName(Long id);
    List<String> retrieveDogNames();

}
