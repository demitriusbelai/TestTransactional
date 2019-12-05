package br.unesp.fc.testtransactional.repositories;

import br.unesp.fc.testtransactional.data.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    //@Transactional(readOnly = true)
    Usuario findByEmail(String email);

}
