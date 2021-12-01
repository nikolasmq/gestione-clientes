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

    @PostMapping()
    public UsuarioModel saveUser(@RequestBody UsuarioModel user){
        return this.usuarioService.saveUser(user);
    }
}
