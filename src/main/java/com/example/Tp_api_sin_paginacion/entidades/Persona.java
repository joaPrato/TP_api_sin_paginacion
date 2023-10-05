package com.example.Tp_api_sin_paginacion.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class Persona extends BaseEntidad{
    private String nombre;
    private String apellido;
    private int dni;
    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinTable(
            name = "persona_libro",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id")
    )
    //@JoinColumn(name = "persona_id")
    private List<Libro> libros = new ArrayList<Libro>();

}