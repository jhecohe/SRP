/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Perfil;
import com.srp.persistencia.Usuario;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class UsuarioImpDAO extends HibernateDaoSupport implements UsuarioIntDAO {

    @Override
    public boolean agregar(Usuario obj) {
        getHibernateTemplate().save(obj);
        return true;
    }

    @Override
    public boolean actualizar(Usuario obj, int perfil) {
        Perfil objeto = new Perfil();
        objeto.setIdperfil(perfil);
        obj.setPerfil(objeto);
        getHibernateTemplate().update(obj);
        return true;
    }

    @Override
    public List<Usuario> listado() {
        return getHibernateTemplate().find("from Usuario");
    }
    
}
