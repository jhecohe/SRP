/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Planmejoramiento;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class MejoramientoImpDAO extends HibernateDaoSupport implements MejoramientoIntDAO {

    @Override
    public boolean agregar(Planmejoramiento obj) {
        System.out.println("Estamos en el metodo para la insercion de un nuevo mejoramiento");
        getHibernateTemplate().save(obj);
        return true;
    }

    @Override
    public boolean actualizar(Planmejoramiento obj) {
        getHibernateTemplate().update(obj);
        return true;
    }

    @Override
    public List<Planmejoramiento> listado() {
        return getHibernateTemplate().find("from Planmejoramiento");
    }
    
}
