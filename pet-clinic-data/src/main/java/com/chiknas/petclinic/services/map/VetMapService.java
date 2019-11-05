package com.chiknas.petclinic.services.map;

import com.chiknas.petclinic.model.Vet;
import com.chiknas.petclinic.services.VetService;

import java.util.Set;

/**
 * @author nkukn - created on 29-Oct-19 9:53 PM
 */
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
