package com.desatest.model;

import jakarta.persistence.*;
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
@NamedStoredProcedureQuery(
        name = "UserEntity.updateUser",
        procedureName = "pkg_users.update_user",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "pc_cod_user", type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "pc_num_docum", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "pc_nom_user", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "pc_ape_paterno", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "pc_ape_materno", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "pc_cod_sex", type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "pc_address", type = String.class)
        }
)
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
