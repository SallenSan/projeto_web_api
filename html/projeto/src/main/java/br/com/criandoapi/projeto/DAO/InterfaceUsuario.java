package br.com.criandoapi.projeto.DAO;

import br.com.criandoapi.projeto.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceUsuario extends CrudRepository<Usuario, Integer> {
}
