package com.example.Tp_api_sin_paginacion.entidades;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Localidad extends BaseEntidad {
    private String denominacion;

}
