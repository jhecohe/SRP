/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Tiporiesgo;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class TiporiesgoImpDAO extends HibernateDaoSupport {
    
    public boolean agregar(Tiporiesgo obj){
        getHibernateTemplate().save(obj);
        return true;
    }
    
    public boolean actualizar(Tiporiesgo obj){
        getHibernateTemplate().merge(obj);
        return true;
    }
    
    public boolean eliminar(Tiporiesgo obj){
        getHibernateTemplate().delete(obj);
        return true;
    }
    
    public List<Tiporiesgo> listado(){
        List tiporiesgos = getHibernateTemplate().find("from Tiporiesgo");
        return tiporiesgos;
    }
}
