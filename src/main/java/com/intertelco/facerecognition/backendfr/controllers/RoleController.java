package com.intertelco.facerecognition.backendfr.controllers;


import com.intertelco.facerecognition.backendfr.jpa.Role;
import com.intertelco.facerecognition.backendfr.jpa.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public Iterable<Role> getAllRoles(){
        return roleService.getRoles();
    }

}
