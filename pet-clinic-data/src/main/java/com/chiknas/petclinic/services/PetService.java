package com.chiknas.petclinic.services;

import com.chiknas.petclinic.model.Pet;

import java.util.Set;

/**
 * @author nkukn - created on 20-Oct-19 9:43 PM
 */
public interface PetService {
    Pet findById(Long id);

    Set<Pet> findAll();

    Pet save(Pet pet);
}
