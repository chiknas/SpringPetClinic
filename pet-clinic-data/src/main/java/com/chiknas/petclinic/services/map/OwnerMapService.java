package com.chiknas.petclinic.services.map;

import com.chiknas.petclinic.model.Owner;
import com.chiknas.petclinic.services.CrudService;

import java.util.Set;

/**
 * @author nkukn - created on 29-Oct-19 9:44 PM
 */
public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
