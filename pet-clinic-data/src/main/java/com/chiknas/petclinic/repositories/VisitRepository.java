package com.chiknas.petclinic.repositories;

import com.chiknas.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * com.chiknas.petclinic.repositories.VisitRepository, created on 13/12/2019 17:15 <p>
 * @author NikolaosK
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
