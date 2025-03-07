package com.desafio.api.services;

import com.desafio.api.models.Usuario;
import com.desafio.api.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Indica que esta classe é um serviço
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll(); // Retorna todos os usuários
    }

    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario); // Salva um usuário
    }

    public void deletarUsuario(Long id) {
        usuarioRepository.deleteById(id); // Deleta um usuário pelo ID
    }
}