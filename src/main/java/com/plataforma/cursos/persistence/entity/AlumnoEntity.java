package com.plataforma.cursos.persistence.entity;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "alumnos")
public class AlumnoEntity {

    @Id   //Id indica que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // Estrategia que genera el Id automáticamente con incremento
    @Column(name = "id_usuario", nullable = false) // Nombre de columna, no puede ser null
    private Integer idUsuario;

    @Column(nullable = false, length = 30)
    private String nombre;

    @Column(nullable = false, length = 30)
    private String apellido;

    //EMAIL, FECHA NACIMIENTO, FK = PLANID
    @Column(nullable = false, length = 40, unique = true)
    private String email;

    @Column(nullable = false)
    private Date fechaNacimiento;



}
