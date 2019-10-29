package com.chiknas.petclinic.services;

import java.util.Set;

/**
 * @author nkukn - created on 29-Oct-19 9:26 PM
 */
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T type);

    void delete(T type);

    void deleteById(ID id);
}
