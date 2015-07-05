/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Usuario;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class LoginImpDAO extends HibernateDaoSupport implements LoginIntDAO {

    @Override
    public Usuario validaLogin(Usuario obj) {
        System.out.println("Entramos en el loginImpDAO");
        List<Usuario> list = getHibernateTemplate().find("from Usuario where nombreusuario = ? and clave = ?",
                obj.getNombreusuario(), obj.getClave());
        if (list.size() > 0) {
            return list.get(0);
        } 
        return null;
    }
    
}
