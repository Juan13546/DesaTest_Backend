package com.desatest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @Column(name = "cod_user")
    private Long codUser;

    @Column(name = "num_docum")
    private String numDocum;

    @Column(name = "nom_user")
    private String nomUser;

    @Column(name = "ape_paterno")
    private String apePaterno;

    @Column(name = "ape_materno")
    private String apeMaterno;

    @Column(name = "cod_sex")
    private Long codSex;

    @Column(name = "address")
    private String address;

    @Column(name = "cod_role")
    private Long codRole;


}
