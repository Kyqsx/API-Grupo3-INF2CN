package com.bemclinicinf2cn.api.repository;

import org.springframework.data.repository.CrudRepository;
import com.bemclinicinf2cn.api.domain.Usuario;
import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    // Método personalizado para buscar um usuário pelo e-mail
    Optional<Usuario> findByEmail(String email);
}
