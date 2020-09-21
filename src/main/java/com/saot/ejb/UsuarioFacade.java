package com.saot.ejb;

import com.saot.model.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "Saot_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    @Override
    public Usuario iniciarSesion(Usuario usr) {
        Usuario usuario = null;
        String consulta;
        try {
            //consulta = "SELECT * FROM usuario WHERE correo = ?1 AND clave = ?2"; // SQL
            consulta = "FROM Usuario u WHERE u.correo = ?1 AND u.clave = ?2";// JPA -> JPQL
            
            Query query = em.createQuery(consulta);
            query.setParameter(1, usr.getCorreo());
            query.setParameter(2, usr.getClave());
                    
            List<Usuario> lista = query.getResultList();
            
            if (!lista.isEmpty()) {
                usuario = lista.get(0);
            }
            
        } catch (Exception e) {
            throw e;
        }
        return usuario;
    }
    
}
