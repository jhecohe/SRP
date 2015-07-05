/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Grado;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class GradoImpDAO extends HibernateDaoSupport {
 
    public boolean agregar(Grado obj){
        getHibernateTemplate().save(obj);
        return true;
    }
    
    public boolean actualizar (Grado obj){
        getHibernateTemplate().update(obj);
        return true;
    }
    
    public List listado (){
        return getHibernateTemplate().find("from Grado");
    }
}
