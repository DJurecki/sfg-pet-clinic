package com.jurecki.sfgpetclinic.repositories;

import com.jurecki.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
