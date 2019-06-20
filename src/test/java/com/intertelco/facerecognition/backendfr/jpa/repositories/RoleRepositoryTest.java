package com.intertelco.facerecognition.backendfr.jpa.repositories;

import com.intertelco.facerecognition.backendfr.jpa.Role;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void testIfSaveRole(){
        Role role = new Role("ADMIN", "ADMINISTRATOR");
        role = roleRepository.save(role);
        Assert.assertTrue(role.getId()==1);
    }

    @Test
    public void testGetAllRoles(){

        boolean response = ((List<Role>) roleRepository.findAll()).size()==0;
        Assert.assertTrue(response);

        roleRepository.save(new Role("ADMIN", "ADMINISTRATOR"));
        roleRepository.save(new Role("USER", "USERS"));
        roleRepository.save(new Role("GUEST", "GUESTS"));
        roleRepository.save(new Role("OTHER", "OTHERS"));
        Assert.assertTrue(((List<Role>) roleRepository.findAll()).size()==4);
    }

}