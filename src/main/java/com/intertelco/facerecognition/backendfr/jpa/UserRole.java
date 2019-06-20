package com.intertelco.facerecognition.backendfr.jpa;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class UserRole {

    @EmbeddedId
    private UserRoleId userRole;
    @JoinColumn(name = "user", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private User user;
    @JoinColumn(name = "role", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Role role;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created")
    private Date create;

}
