package com.chiknas.petclinic.services.jpa;

import com.chiknas.petclinic.model.Pet;
import com.chiknas.petclinic.repositories.PetRepository;
import com.chiknas.petclinic.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * com.chiknas.petclinic.services.jpa.PetJpaService, created on 08/01/2020 11:02 <p>
 *
 * @author NikolaosK
 */
@Service
@Profile("jpa")
public class PetJpaService implements PetService {

    private final PetRepository petRepository;

    @Autowired
    public PetJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
