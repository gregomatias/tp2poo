package service;

import java.util.ArrayList;
import java.util.List;

import dominio.Usuario;

public class UsuarioService {
    private List<Usuario> usuarios;
    
    public UsuarioService(){
        usuarios = new ArrayList<Usuario>();
    }

    public void instanciaUsuarios(){
        usuarios.add(new Usuario("matias", 1234));
        usuarios.add(new Usuario("leandro", 1234));

    }

    public boolean validaUsuario(String nombreUsuario,int clave){
       
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)&&usuario.getClave()==clave) {
                return true;
            }
        }
        return false;

    }



}
