package com.intertelco.facerecognition.backendfr.jpa.repositories;

import com.intertelco.facerecognition.backendfr.jpa.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
