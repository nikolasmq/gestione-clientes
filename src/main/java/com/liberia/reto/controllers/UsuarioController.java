package com.liberia.reto.controllers;

import com.liberia.reto.models.UsuarioModel;
import com.liberia.reto.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/user")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> getUsers(){
        return usuarioService.getUser();
    }

    // @GetMapping("/{id}")
    // public ArrayList<UsuarioModel> getUsers(){
    //     return usuarioService.getUser();
    // }

    @PostMapping()
    public UsuarioModel saveUser(@RequestBody UsuarioModel user){
        return this.usuarioService.saveUser(user);
    }

    @GetMapping("/id")
    public ArrayList<UsuarioModel> getByDocumento(@RequestParam("documento") int documento){
        return this.usuarioService.searchByDocument(documento);
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deletUserId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.deletUser(id);
        if (ok){
            return "Se elimino exitosamente el usuario con el id "+ id;
        }else {
            return "No se pudo eliminar el usuario con id "+ id;
        }
    }
}
