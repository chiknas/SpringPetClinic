package com.chiknas.petclinic.model;

/**
 * @author nkukn - created on 19-Oct-19 9:41 PM
 */
public class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
