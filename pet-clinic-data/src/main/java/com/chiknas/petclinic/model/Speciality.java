package com.chiknas.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author nkukn - created on 17/11/2019 9:24 μ.μ.
 */
@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
