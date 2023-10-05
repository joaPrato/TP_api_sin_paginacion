package com.example.Tp_api_sin_paginacion.repositorios;

import com.example.Tp_api_sin_paginacion.entidades.BaseEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository <E extends BaseEntidad , ID extends Serializable> extends JpaRepository<E,ID> {

}
