package com.chiknas.petclinic.services.map;

import com.chiknas.petclinic.model.BaseEntity;

import java.util.*;

/**
 * @author nkukn - created on 29-Oct-19 9:35 PM
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Objects can not be null");
        }

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {
        return !map.keySet().isEmpty() ? Collections.max(map.keySet()) + 1 : 1L;
    }
}
