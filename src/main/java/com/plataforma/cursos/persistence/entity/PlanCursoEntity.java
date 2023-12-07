package com.plataforma.cursos.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "plan_curso")

@Getter
@Setter
@NoArgsConstructor

public class PlanCursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso", nullable = false)
    private Integer IdCurso;

    @Id
    @Column(name = "id_plan")
    private Integer idPlan;

    @Id
    @Column(name = "id_curso")
    private Integer idCurso;

    @OneToOne
    @JoinColumn(name = "id_plan", referencedColumnName = "id_plan", insertable = false, updatable = false)
    private PlanEntity plan;

    @OneToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso", insertable = false, updatable = false)
    private CursosEntity cursos;

}
