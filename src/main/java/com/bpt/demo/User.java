package com.bpt.demo;


import com.bpt.demo.controller.ParentEntity;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Access(AccessType.FIELD)
public class User extends ParentEntity {
    private static final long serialVersionUID = 8852316006887138483L;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSecondnombre() {
        return secondnombre;
    }

    public void setSecondnombre(String secondnombre) {
        this.secondnombre = secondnombre;
    }

    public String getFirstapellido() {
        return firstapellido;
    }

    public void setFirstapellido(String firstapellido) {
        this.firstapellido = firstapellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Column(name = "nombre",nullable = false, length = 255)
    private String nombre;

    @Column(name = "second_nombre",nullable = true, length = 255)
   private String secondnombre ;

    @Column(name = "first_apellido",nullable = true, length = 255)
   private String firstapellido ;

    @Column(name = "telefono",nullable = true, length = 255)
   private String telefono ;




}
