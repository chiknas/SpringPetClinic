package com.chiknas.petclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author nkukn - created on 17/11/2019 9:24 μ.μ.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity {
    private String description;
}
