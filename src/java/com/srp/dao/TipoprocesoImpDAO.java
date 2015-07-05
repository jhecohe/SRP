/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Tipoproceso;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class TipoprocesoImpDAO extends HibernateDaoSupport {
    
    public boolean agregar(Tipoproceso obj){
        getHibernateTemplate().save(obj);
        return true;
    }
    
    public boolean actualizar(Tipoproceso obj){
        getHibernateTemplate().update(obj);
        return true;
    }
    
    public boolean elminar(Tipoproceso obj){
        getHibernateTemplate().delete(obj);
        return true;
    }
    
    public List listado(){        
        return getHibernateTemplate().find("from Tipoproceso");
    }
}
