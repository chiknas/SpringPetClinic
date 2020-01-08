package com.chiknas.petclinic.repositories;

import com.chiknas.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * com.chiknas.petclinic.repositories.OwnerRepository, created on 13/12/2019 17:12 <p>
 *
 * @author NikolaosK
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
