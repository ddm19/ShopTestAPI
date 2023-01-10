package com.IWTech.IWTechApp.model;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombreUsuario;

    @Column(name = "password")
    private String password;

    @Column(name = "nombreCompleto")
    private String nombreCompleto;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "email")
    private String email;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "tipo")
    private Tipo tipo;

    @ManyToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    List<Pedido> producto = new ArrayList<>();

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    List<Pedido> pedido = new ArrayList<>();


}
