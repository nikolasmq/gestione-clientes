package com.liberia.reto.services;

import com.liberia.reto.models.UsuarioModel;
import com.liberia.reto.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

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

    /**
     * Metodo para buscar un usuario por el id
     * @param id
     * @return
     */
    public Optional<UsuarioModel> searchById(Long id){
        return usuarioRepository.findById(id);
    }

    /**
     * Retorna un usuario cuando se busca por el documento
     * @param documento
     * @return
     */
    public ArrayList<UsuarioModel> searchByDocument(int documento){
        return usuarioRepository.findByDocumento(documento);
    }

    /**
     * Eliminar usuario por el id que tiene en la base de datos
     * @param id
     * @return
     */
    public boolean deletUser(Long id){
        /**
         * Controlamos la respuesta con un try catch para pasar la respuesta controlada
         */
        try {
            usuarioRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}

