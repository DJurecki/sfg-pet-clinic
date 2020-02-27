package com.jurecki.sfgpetclinic.repositories;

import com.jurecki.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
