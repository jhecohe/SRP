/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Perfil;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class PerfilImpDAO extends HibernateDaoSupport {
    
    public boolean agregar(Perfil obj){
        getHibernateTemplate().save(obj);
        return true;
    }
    
    public boolean actualizar(Perfil obj){
        getHibernateTemplate().update(obj);
        return true;
    }
    
    public List listado(){
        return getHibernateTemplate().find("from Perfil");
    }
}
