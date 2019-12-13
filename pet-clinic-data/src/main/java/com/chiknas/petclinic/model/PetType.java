package com.chiknas.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author nkukn - created on 19-Oct-19 9:41 PM
 */
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
