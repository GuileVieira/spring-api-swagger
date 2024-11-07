package estudos.web.api.repository;

import estudos.web.api.handler.BusinessException;
import estudos.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getLogin()==null) throw new BusinessException("O login deve ser informado");
        if(usuario.getPassword()==null) throw new BusinessException("A senha deve ser informada");
        if(usuario.getId() == null) System.out.println("SAVE - RECEBENDO o usario na camada de repositório");
        else System.out.println("UPDATE - RECEBENDO o usario na camada de repositório");
        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.printf("\nDELETE/id - RECEBENDO o id %s na camada de repositório", id);
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema na camada de repositório");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("admin", "admin"));
        usuarios.add(new Usuario("user", "user"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.printf("FIND/id - Recebendo o id %s na camada de repositório%n", id);
        return new Usuario("admin", "admin");
    }

    public Usuario findByLogin(String login){
        System.out.printf("FIND/login - Recebendo o login %s na camada de repositório%n", login);
        return new Usuario("admin", "admin");
    }
}
