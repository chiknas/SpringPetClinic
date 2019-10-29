package com.chiknas.petclinic.services;

import java.util.Set;

/**
 * @author nkukn - created on 29-Oct-19 9:26 PM
 */
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
