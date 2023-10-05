package com.example.Tp_api_sin_paginacion.servicios;

import com.example.Tp_api_sin_paginacion.entidades.Persona;
import com.example.Tp_api_sin_paginacion.repositorios.BaseRepository;
import com.example.Tp_api_sin_paginacion.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class PersonaServiceImpl extends BaseServiceImpl <Persona,Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }
}
