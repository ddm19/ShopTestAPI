package com.IWTech.IWTechApp.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "multimedia")
public class Multimedia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "archivo")
    private String archivo;

    @Column(name = "ruta")
    private String ruta;
}