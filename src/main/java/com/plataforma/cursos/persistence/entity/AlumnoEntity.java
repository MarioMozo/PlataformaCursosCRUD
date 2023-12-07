package com.plataforma.cursos.persistence.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "alumnos")
@Getter
@Setter
@NoArgsConstructor
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

    //Relacion con la tabla plan con idPlan
    //  OneToOne = La tabla alumno solo puede tener relación con un solo plan de laa tabla Plan
    // JoinColum = Este metodo es para especificar la columna por la cual se esta relacionando, se agrega el nombre, y la referencia de la otra tabla,
    // Se le agregan dos parametros, para que no inserte datos y para no que actualice, ya que estos existen en la otra tabla.
    @OneToOne
    @JoinColumn(name = "id_plan", referencedColumnName = "id_plan", insertable = false, updatable = false)
    private PlanEntity plan;



}
