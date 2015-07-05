/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Cargo;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class CargoImpDAO extends HibernateDaoSupport {
    
    public boolean agregar(Cargo obj){
        getHibernateTemplate().save(obj);
        return true;
    }
    
    public boolean actualizar(Cargo obj, String desc){
        getHibernateTemplate().update(obj);
        return true;
    }
    
    public List<Cargo> lstado(){
        return getHibernateTemplate().find("from Cargo");
    }
}
