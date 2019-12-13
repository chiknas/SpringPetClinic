package com.chiknas.petclinic.repositories;

import com.chiknas.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * com.chiknas.petclinic.repositories.PetTypeRepository, created on 13/12/2019 17:15 <p>
 * @author NikolaosK
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
