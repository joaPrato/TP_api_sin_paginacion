package com.example.Tp_api_sin_paginacion.servicios;

import com.example.Tp_api_sin_paginacion.entidades.BaseEntidad;

import java.io.Serializable;
import java.util.List;
public interface BaseService <E extends BaseEntidad,ID extends Serializable> { //Van todas las operaciones que son comunes en todo el modelo

    public List<E> findAll() throws Exception;

    public E findById(ID id) throws Exception;

    public E save(E entity) throws Exception;

    public E upDate(ID id,E entity) throws Exception;

    public boolean delete(ID id) throws Exception;


}

