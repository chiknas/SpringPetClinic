package com.chiknas.petclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author nkukn - created on 19-Oct-19 9:41 PM
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
    private String name;
}
