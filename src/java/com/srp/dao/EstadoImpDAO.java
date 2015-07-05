/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Estado;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class EstadoImpDAO extends HibernateDaoSupport {
    
    public boolean agregar(Estado obj) {
        getHibernateTemplate().save(obj);
        return true;
    }
    
    public boolean actualizar(Estado obj) {
        getHibernateTemplate().update(obj);
        return true;
    }
    
    public boolean eliminar(Estado obj) {
        getHibernateTemplate().delete(obj);
        return true;
    }
    
    public List<Estado> listado(){
        List<Estado> estados = getHibernateTemplate().find("from Estado");
        return estados;
    }
}
