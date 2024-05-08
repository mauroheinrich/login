
package com.mauroheinrich.login.logica;


import com.mauroheinrich.login.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis;// = new ControladoraPersistencia();
    
    public Controladora(){
        controlPersis = new ControladoraPersistencia();
    }

    public String validarUsuario(String usuario, String contrasenia) {
        
        String mensaje="";
        List<Usuario>listaUsuarios = controlPersis.traerUsuarios();
        
        for( Usuario usu: listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia)){
                    mensaje="Usuario y contraseña correctos. Bienvenido!";
                    return mensaje;
                }
                else{
                    mensaje="Contraseña incorrecta";
                    return mensaje;
                }
            }
            else{
                mensaje="Usuario no encontrado";
               
            }
        }
        
        return mensaje;
    }
}
