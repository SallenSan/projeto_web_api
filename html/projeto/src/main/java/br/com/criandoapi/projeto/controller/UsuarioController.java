package br.com.criandoapi.projeto.controller;

import br.com.criandoapi.projeto.DAO.InterfaceUsuario;
import br.com.criandoapi.projeto.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController{
    @Autowired
    private InterfaceUsuario dao;
    @GetMapping
    public List<Usuario> usuarioList (){
        return (List<Usuario>) dao.findAll();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        Usuario novoUsuario = dao.save(usuario);
        return novoUsuario;
    }

}
