package com.chiknas.petclinic.services;

import com.chiknas.petclinic.model.Owner;

import java.util.Set;

/**
 * @author nkukn - created on 20-Oct-19 9:36 PM
 */
public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Set<Owner> findAll();

    Owner save(Owner owner);
}
