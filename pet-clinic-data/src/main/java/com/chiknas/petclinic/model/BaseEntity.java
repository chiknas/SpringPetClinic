package com.chiknas.petclinic.model;

import java.io.Serializable;

/**
 * @author nkukn - created on 20-Oct-19 9:48 PM
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
