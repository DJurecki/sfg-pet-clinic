package com.jurecki.sfgpetclinic.services;

import com.jurecki.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
