/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Seccional;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class SeccionalImpDAO extends HibernateDaoSupport{
    
    public boolean agregar(Seccional obj){
        getHibernateTemplate().save(obj);
        return true;
    }
    
    public boolean actualizar(Seccional obj, String desc){
        obj.setDescseccional(desc);
        getHibernateTemplate().update(obj);
        return true;
    }
    
    public boolean eliminar(Seccional obj){
        getHibernateTemplate().delete(obj);
        return true;
    }
    
    public List<Seccional> listado(){
        return getHibernateTemplate().find("from Seccional");
    }
    
    public List<Seccional> listadoPorRegional(int idregional){
        return getHibernateTemplate().find("from Seccional where idregional = ?", idregional);
    }
}
