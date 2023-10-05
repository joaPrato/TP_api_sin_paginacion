package com.example.Tp_api_sin_paginacion.repositorios;


import com.example.Tp_api_sin_paginacion.entidades.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}
