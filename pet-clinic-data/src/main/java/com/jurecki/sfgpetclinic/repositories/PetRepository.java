package com.jurecki.sfgpetclinic.repositories;

import com.jurecki.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
