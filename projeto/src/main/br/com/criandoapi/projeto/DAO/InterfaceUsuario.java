package src.main.br.com.criandoapi.projeto.DAO;

import src.main.br.com.criandoapi.projeto.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceUsuario extends CrudRepository<Usuario, Integer> {
}
