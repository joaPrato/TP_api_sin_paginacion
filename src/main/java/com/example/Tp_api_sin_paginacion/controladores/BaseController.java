package com.example.Tp_api_sin_paginacion.controladores;

import com.example.Tp_api_sin_paginacion.entidades.BaseEntidad;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends BaseEntidad,ID extends Serializable> {
    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getOne(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> upDate(@PathVariable ID id,@RequestBody E entity);
    public ResponseEntity<?> delete(@PathVariable ID id);
}
