package com.intertelco.facerecognition.backendfr.jpa.services;

import com.intertelco.facerecognition.backendfr.jpa.Role;
import com.intertelco.facerecognition.backendfr.jpa.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Iterable<Role> getRoles() {
        return roleRepository.findAll();
    }
}
