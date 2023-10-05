package com.example.Tp_api_sin_paginacion.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Libro extends BaseEntidad{
    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
