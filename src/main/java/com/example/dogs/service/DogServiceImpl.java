package com.example.dogs.service;


import com.example.dogs.entity.Dog;
import com.example.dogs.repository.DogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DogServiceImpl implements DogService{

    private final String ACCESS_EXISTS = "Cet accès existe déja!";
    private final DogRepository dogRepository;
//    private final Dog dog;

    @Override
    public List<Dog> retrieveDogs() {
        return dogRepository.findAll();
    }

    @Override
    public List<String> retrieveDogBreed() {
        return dogRepository.findAllBreeds();
    }

    @Override
    public String retrieveDogBreedByName(Long id) {
        return dogRepository.findBreedById(id);
    }

    @Override
    public List<String> retrieveDogNames() {
        return dogRepository.findAllNames();
    }

}
