package com.universidad.registro.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private NombreRol nombre;

    public enum NombreRol {
        ROL_ADMIN,
        ROL_DOCENTE,
        ROL_ESTUDIANTE,
        ROL_SEGURIDAD,
        ROL_MANTENIMIENTO
    }
}
