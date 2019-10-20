package com.chiknas.petclinic.model;

import java.time.LocalDate;

/**
 * @author nkukn - created on 19-Oct-19 9:41 PM
 */
public class Pet extends BaseEntity {
    LocalDate birthDate;
    PetType petType;
    Owner owner;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
