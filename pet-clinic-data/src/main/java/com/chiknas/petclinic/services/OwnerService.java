package com.chiknas.petclinic.services;

import com.chiknas.petclinic.model.Owner;

/**
 * @author nkukn - created on 20-Oct-19 9:36 PM
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
