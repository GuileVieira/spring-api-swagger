package estudos.web.api.controller;

import estudos.web.api.model.Usuario;
import estudos.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
@Autowired
private UsuarioRepository usuarioRepository;

@GetMapping
//@Operation(summary = "Lista de usuarios", description = "Este endpoint retorna uma lista de todos os usuarios")
    public List<Usuario> getUsers(){
        return usuarioRepository.findAll();
    }

@GetMapping("/{login}")
public Usuario getOne(@PathVariable("login") String login){
    return usuarioRepository.findByLogin(login);
}

@DeleteMapping("/{id}")
public void deleteUser(@PathVariable("id") Integer id){
    usuarioRepository.deleteById(id);
}

@PostMapping
public void postUser(@RequestBody Usuario usuario){
    usuarioRepository.save(usuario);
}

@PutMapping
    public void putUser(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }

}
