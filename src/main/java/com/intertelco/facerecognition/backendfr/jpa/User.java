package com.intertelco.facerecognition.backendfr.jpa;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.REMOVE,
            CascadeType.REFRESH }, mappedBy = "user", fetch = FetchType.EAGER)
    private Collection<UserRole> userRoles;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
