package com.example.Tp_api_sin_paginacion.controladores;

import com.example.Tp_api_sin_paginacion.entidades.Localidad;
import com.example.Tp_api_sin_paginacion.servicios.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/v1/Localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
