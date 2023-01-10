package com.IWTech.IWTechApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

public class Pedido {

    @Column(name = "numpedido")
    private long numpedido;

    @Column(name = "estado")
    private Estado estado;

    @Column(name = "fecha")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
