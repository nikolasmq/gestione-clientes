package com.liberia.reto.repositories;

import com.liberia.reto.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    ArrayList<UsuarioModel> findUsuarioModelByDocumento = null;
}
