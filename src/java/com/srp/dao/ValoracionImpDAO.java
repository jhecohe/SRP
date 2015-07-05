/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.dao.ValoracionIntDAO;
import com.srp.persistencia.Analisisvaloracion;
import com.srp.persistencia.Proceso;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class ValoracionImpDAO extends HibernateDaoSupport implements ValoracionIntDAO {

    @Override
    public boolean agregar(Analisisvaloracion obj) {
       getHibernateTemplate().save(obj);
       return true;
    }

    @Override
    public boolean actualizar(Analisisvaloracion obj) {
        getHibernateTemplate().update(obj);
        return true;
    }

    @Override
    public List<Analisisvaloracion> listado() {
        return getHibernateTemplate().find("from Analisisvaloracion");
    }    
}
