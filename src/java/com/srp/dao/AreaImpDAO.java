/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Area;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class AreaImpDAO extends HibernateDaoSupport {
    
     public boolean agregar(Area obj){
        getHibernateTemplate().save(obj);
        return true;
    }
    
    public boolean actualizar(Area obj){
        getHibernateTemplate().update(obj);
        return true;
    }
    
    public boolean eliminar(Area obj){
        getHibernateTemplate().delete(obj);
        return true;
    }
    
    public List<Area> listado(){
        return getHibernateTemplate().find("from Area");
    }
    
    public List<Area> listadoPorRegional(int idseccional){
        return getHibernateTemplate().find("from Area where idseccional = ?", idseccional);
    }
}
