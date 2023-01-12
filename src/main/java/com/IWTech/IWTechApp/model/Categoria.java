package com.IWTech.IWTechApp.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "visibilidad")
    private Boolean visibilidad;

    @Column(name = "contenido")
    private String contenido;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria_padre;
}
