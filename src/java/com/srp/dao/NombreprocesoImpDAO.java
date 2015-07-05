/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Nombreproceso;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class NombreprocesoImpDAO extends HibernateDaoSupport {
    
    public boolean agregar(Nombreproceso obj){
        getHibernateTemplate().save(obj);
        return true;
    }
    
    public boolean actualizar(Nombreproceso obj){
        getHibernateTemplate().update(obj);
        return true;
    }
    
    public boolean eliminar(Nombreproceso obj){
        getHibernateTemplate().delete(obj);
        return true;
    }
    
    public List<Nombreproceso> listado(){
        return getHibernateTemplate().find("from Nombreproceso");
    }
    
    public List<Nombreproceso> listadoPorTipo(int idtipo){
        return getHibernateTemplate().find("from Nombreproceso where idtipoproceso = ?", idtipo);
    }
}
