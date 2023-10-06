package com.example.Tp_api_sin_paginacion.controladores;

import com.example.Tp_api_sin_paginacion.entidades.Autor;
import com.example.Tp_api_sin_paginacion.servicios.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
}