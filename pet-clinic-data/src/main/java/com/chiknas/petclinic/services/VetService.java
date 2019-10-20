package com.chiknas.petclinic.services;

import com.chiknas.petclinic.model.Vet;

import java.util.Set;

/**
 * @author nkukn - created on 20-Oct-19 9:44 PM
 */
public interface VetService {
    Vet findById(Long id);

    Set<Vet> findAll();

    Vet save(Vet vet);
}
