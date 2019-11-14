package com.chiknas.petclinic.model;

import java.util.Set;

/**
 * @author nkukn - created on 19-Oct-19 9:40 PM
 */
public class Owner extends Person {
    Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
