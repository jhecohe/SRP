/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Subarea;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class SubareaImpDAO extends HibernateDaoSupport {
    
    public boolean agregar(Subarea obj){
        getHibernateTemplate().save(obj);
        return true;
    }
    
    public boolean actualizar(Subarea obj, String desc){
        getHibernateTemplate().update(obj);
        return true;
    }
    
    public boolean eleminar(Subarea obj){
        getHibernateTemplate().delete(obj);
        return true;
    }
    
    public List<Subarea> listado(){
        return getHibernateTemplate().find("from Subarea");
    }
    
    public List<Subarea> listadoPorArea(int idarea){
        return getHibernateTemplate().find("from Subarea where idarea = ?", idarea);
    }
}
