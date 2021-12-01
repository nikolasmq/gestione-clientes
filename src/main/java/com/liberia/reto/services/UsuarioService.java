package com.liberia.reto.services;

import com.liberia.reto.models.UsuarioModel;
import com.liberia.reto.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    /**
     * Metodo para guardar el usuario en la base de datos
     * @param user
     * @return
     */
    public UsuarioModel saveUser(UsuarioModel user){
        return usuarioRepository.save(user);
    }

    /**
     * Optenemos todos los usuarios almacenados en la base de datos en un array list
     * @return
     */
    public ArrayList<UsuarioModel> getUser(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
}
