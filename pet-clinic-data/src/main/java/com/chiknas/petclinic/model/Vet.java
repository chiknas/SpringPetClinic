package com.chiknas.petclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author nkukn - created on 19-Oct-19 9:40 PM
 */
public class Vet extends Person {
    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
