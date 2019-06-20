package com.intertelco.facerecognition.backendfr.jpa;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@Data
public class UserRoleId implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional=false)
    @NotNull
    private Long user;
    @Basic(optional=false)
    @NotNull
    private Long role;

}
