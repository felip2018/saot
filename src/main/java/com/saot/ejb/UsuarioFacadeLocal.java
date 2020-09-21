package com.saot.ejb;

import com.saot.model.Usuario;
import java.util.List;
import javax.ejb.Local;

@Local
public interface UsuarioFacadeLocal {

    void create(Usuario usuario);

    void edit(Usuario usuario);

    void remove(Usuario usuario);

    Usuario find(Object id);

    List<Usuario> findAll();

    List<Usuario> findRange(int[] range);

    int count();
    
    // Metodo para el inicio de sesion
    Usuario iniciarSesion(Usuario usr);
        
}
