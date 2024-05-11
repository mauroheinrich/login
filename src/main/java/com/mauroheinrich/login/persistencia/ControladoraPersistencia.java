
package com.mauroheinrich.login.persistencia;

import com.mauroheinrich.login.logica.Usuario;
import com.mauroheinrich.login.persistencia.UsuarioJpaController;
import java.util.List;



public class ControladoraPersistencia {
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();

  public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
        //SELECT * FROM USUARIOS
    }

    
    
    
    
    
}
