/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Clase;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class ClaseImpDAO extends HibernateDaoSupport {
    
    public boolean agregar(Clase obj){
        getHibernateTemplate().save(obj);
        return true;
    }
    
    public boolean actualizar(Clase obj){
        getHibernateTemplate().update(obj);
        return true;
    }
    
    public List listado(){
        return getHibernateTemplate().find("from Clase");
    }
}
