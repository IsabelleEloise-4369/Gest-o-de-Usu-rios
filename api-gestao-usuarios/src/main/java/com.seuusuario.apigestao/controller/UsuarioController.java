package com.desafio.api.controllers;

import com.desafio.api.models.Usuario;
import com.desafio.api.services.UsuarioService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // Indica que esta classe é um controlador REST
@RequestMapping("/usuarios") // Define o caminho base para os endpoints
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        usuarioService.deletarUsuario(id);
    }
}