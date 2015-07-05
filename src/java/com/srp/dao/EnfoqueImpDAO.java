/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.dao;

import com.srp.persistencia.Enfoque;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class EnfoqueImpDAO extends HibernateDaoSupport {

    public boolean agregar(Enfoque obj) {
        getHibernateTemplate().save(obj);
        return true;
    }

    public boolean actualizar(Enfoque obj) {
        getHibernateTemplate().merge(obj);
        return true;
    }

    public boolean eliminar(Enfoque obj) {
        getHibernateTemplate().delete(obj);
        return true;
    }

    public List<Enfoque> listado() {
        return getHibernateTemplate().find("from Enfoque");
    }
}
