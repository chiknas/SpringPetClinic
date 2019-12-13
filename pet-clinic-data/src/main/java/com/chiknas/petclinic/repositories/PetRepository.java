package com.chiknas.petclinic.repositories;

import com.chiknas.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * com.chiknas.petclinic.repositories.PetRepository, created on 13/12/2019 17:13 <p>
 * @author NikolaosK
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
