package com.chiknas.petclinic.services.map;

import com.chiknas.petclinic.model.Pet;
import com.chiknas.petclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author nkukn - created on 29-Oct-19 9:50 PM
 */
@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
