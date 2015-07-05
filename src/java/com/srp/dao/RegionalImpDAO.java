/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Regional;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class RegionalImpDAO extends HibernateDaoSupport {
    
    public boolean agregar(Regional obj){
        getHibernateTemplate().save(obj);
        return true;
    }
    
    public boolean actualizar(Regional obj){
        getHibernateTemplate().update(obj);
        return true;
    }
    
    public boolean eliminar(Regional obj){
        getHibernateTemplate().update(obj);
        return true;
    }
    
    public List<Regional> listado(){
        return getHibernateTemplate().find("from Regional");
    }
}
