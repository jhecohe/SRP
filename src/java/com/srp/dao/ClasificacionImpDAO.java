/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.dao;

import com.srp.persistencia.Clasificacion;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class ClasificacionImpDAO extends HibernateDaoSupport {

    public boolean agregar(Clasificacion obj) {
        getHibernateTemplate().save(obj);
        return true;
    }

    public boolean actualizar(Clasificacion obj) {
        getHibernateTemplate().merge(obj);
        return true;
    }

    public boolean eliminar(Clasificacion obj) {
        getHibernateTemplate().delete(obj);
        return true;
    }

    public List<Clasificacion> listado() {
        return getHibernateTemplate().find("from Clasificacion");
    }

}
