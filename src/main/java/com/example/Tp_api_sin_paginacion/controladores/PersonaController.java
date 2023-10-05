package com.example.Tp_api_sin_paginacion.controladores;

import com.example.Tp_api_sin_paginacion.entidades.Persona;
import com.example.Tp_api_sin_paginacion.servicios.BaseServiceImpl;
import com.example.Tp_api_sin_paginacion.servicios.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona,PersonaServiceImpl> {

}