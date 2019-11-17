package com.chiknas.petclinic.model;

/**
 * @author nkukn - created on 17/11/2019 9:24 μ.μ.
 */
public class Speciality extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
