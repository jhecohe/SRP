/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Riesgo;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class RiesgoImpDAO extends HibernateDaoSupport implements RiesgoIntDAO {

    @Override
    public boolean agregar(Riesgo obj) {
        System.out.println("Agregar riesgoDAO");
        getHibernateTemplate().save(obj);
        return true;
    }

    @Override
    public boolean actualizar(Riesgo obj) {
        System.out.println("Riesgo actualizar DAO");
        getHibernateTemplate().update(obj);
        return true;
    }

    @Override
    public List<Riesgo> listado() {
        return getHibernateTemplate().find("from Riesgo");
    }
    
}
