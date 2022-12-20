package com.IWTech.IWTechApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    @NotNull
    private String nombre;

    @Column(name = "descripcion_corta")
    private String descripcion_corta;

    @Column(name = "descripcion_larga")
    private String descripcion_larga;

    @NotNull
    @Column(name = "marca")
    private String marca;

    @NotNull
    @Column(name = "precio_particular")
    private Float precio_particular;

    @Column(name = "precio_empresa")
    private Float precio_empresa;

    @Column(name = "valoracion")
    private int valoracion;

    @Column(name = "caracteristicas")
    private String caracteristicas;

    @Column(name = "oferta")
    private Float oferta;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "producto_usuario",
            joinColumns = { @JoinColumn(name = "fk_producto") },
            inverseJoinColumns = {@JoinColumn(name = "fk_usuario")})
    List<Usuario> deseo = new ArrayList<>();
}
