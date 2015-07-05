/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Departamento;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class DepartamentoImpDAO extends HibernateDaoSupport {
    
    public boolean agregar(Departamento obj){
        getHibernateTemplate().save(obj);
        return true;
    }
    
    public boolean actualizar(Departamento obj, String desc){
        obj.setDescdepartamento(desc);
        getHibernateTemplate().update(obj);
        return true;
    }
    
    public List<Departamento> listado(){
        return getHibernateTemplate().find("from Departamento");
    }
}
