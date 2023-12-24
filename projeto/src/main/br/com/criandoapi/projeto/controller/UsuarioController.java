package src.main.br.com.criandoapi.projeto.controller;

import src.main.br.com.criandoapi.projeto.DAO.InterfaceUsuario;
import src.main.br.com.criandoapi.projeto.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
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

    @PutMapping
    public Usuario editarUsuario(@RequestBody Usuario usuario){
        Usuario novoUsuario = dao.save(usuario);
        return novoUsuario;
    }

    @DeleteMapping("/{id}")
    public Optional<Usuario> excluirUsuario (@PathVariable Integer id){
        Optional<Usuario> usuario = dao.findById(id);
        dao.deleteById(id);
        return usuario;
    }

}
