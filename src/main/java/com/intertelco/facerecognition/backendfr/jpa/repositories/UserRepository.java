package com.intertelco.facerecognition.backendfr.jpa.repositories;

import com.intertelco.facerecognition.backendfr.jpa.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
