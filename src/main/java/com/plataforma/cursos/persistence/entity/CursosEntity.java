package com.plataforma.cursos.persistence.entity;

import jakarta.persistence.*;

//Recomendación agregar getters, setters, args, con lombok
@Table(name = "cursos")
public class CursosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // Estrategia que genera el Id automáticamente con incremento
    // FALTO AGREGAR EL NOMBRE DE LA COLUMNA Y NO NULL -> @Column(name = "id_curso", nullable = false)
    private Integer idCurso;
    @Column(name = "nombre_curso", nullable = false, length = 255)
    private String nombreCurso;
    @Column(nullable = false)
    private Integer duracion;
    // Especifica que utiliza tipo de dato TEXT en SQL
    @Column(columnDefinition = "TEXT")
    private String descripcion;

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
