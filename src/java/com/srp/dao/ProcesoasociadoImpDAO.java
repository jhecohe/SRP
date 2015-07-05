/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Procesoasociado;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class ProcesoasociadoImpDAO extends HibernateDaoSupport{
    
    public boolean agregar(Procesoasociado obj){
        getHibernateTemplate().save(obj);
        return true;
    }
    
    public boolean actualizar(Procesoasociado obj){
        getHibernateTemplate().update(obj);
        return true;
    }
    
    public boolean eliminar(Procesoasociado obj){
        getHibernateTemplate().delete(obj);
        return true;
    }
    
    public List<Procesoasociado> listado(){
        return getHibernateTemplate().find("from Procesoasociado");
    }
    
    public List<Procesoasociado> listadoPorNombre(int idnombre){
        System.out.println("DAO listado proceso asociado por nombre");
        return getHibernateTemplate().find("from Procesoasociado where idnombreproceso = ?", idnombre);
    }
}
