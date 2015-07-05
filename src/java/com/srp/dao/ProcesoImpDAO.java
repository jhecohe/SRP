/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Proceso;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class ProcesoImpDAO extends HibernateDaoSupport implements ProcesoIntDAO {

    @Override
    public boolean agregar(Proceso obj) {
        getHibernateTemplate().save(obj);
        return true;
    }

    @Override
    public boolean actualizar(Proceso obj) {
        getHibernateTemplate().update(obj);
        return true;
    }

    @Override
    public boolean eleminar(Proceso obj) {
        getHibernateTemplate().delete(obj);
        return true;
    }

    @Override
    public List<Proceso> listado() {
        System.out.println("ProcesoDAO metodo listado");
        List<Proceso> procesos = getHibernateTemplate().find("from Proceso");
        return procesos;
    }

    public List<Proceso> procesoPorIdListado(int proceso) {
        return getHibernateTemplate().find("from Proceso where id = ?", proceso);
    }
    
}
