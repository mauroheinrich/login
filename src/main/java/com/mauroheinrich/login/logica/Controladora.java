
package com.mauroheinrich.login.logica;


import com.mauroheinrich.login.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis;// = new ControladoraPersistencia();
    
    public Controladora(){
        controlPersis = new ControladoraPersistencia();
    }

    public Usuario validarUsuario(String usuario, String contrasenia) {
        
       // String mensaje="";
       Usuario usr= null;
        List<Usuario>listaUsuarios = controlPersis.traerUsuarios();
        
        for (Usuario usu : listaUsuarios) {  
            if (usu.getNombreUsuario().equals(usuario)) {
                if(usu.getContrasenia().equals(contrasenia)) {
                  
                   usr = usu;
                    return usr;
                }
                else {
                   
                   usr = null;
                    return usr;
                }
            }
            else {
              
               usr = null;
                    
            }
        
        }
        
        return usr;
    }

    
}
