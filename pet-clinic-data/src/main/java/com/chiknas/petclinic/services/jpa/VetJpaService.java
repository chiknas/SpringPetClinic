package com.chiknas.petclinic.services.jpa;

import com.chiknas.petclinic.model.Vet;
import com.chiknas.petclinic.repositories.VetRepository;
import com.chiknas.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * com.chiknas.petclinic.services.jpa.VetJpaService, created on 08/01/2020 10:55 <p>
 *
 * @author NikolaosK
 */
@Service
@Profile("jpa")
public class VetJpaService implements VetService {

    private final VetRepository vetRepository;

    @Autowired
    public VetJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
