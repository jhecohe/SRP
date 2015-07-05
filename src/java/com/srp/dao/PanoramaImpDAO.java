/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Panorama;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class PanoramaImpDAO extends HibernateDaoSupport implements PanoramaIntDAO{

    @Override
    public boolean agregar(Panorama obj) {
        getHibernateTemplate().save(obj);
        return true;
    }

    @Override
    public boolean actualizar(Panorama obj) {
        getHibernateTemplate().update(obj);
        return true;
    }

    @Override
    public List<Panorama> listado() {
        return getHibernateTemplate().find("from Panorama");
    }

    public List<Panorama> listadoPorRiesgo(int proceso) {
        System.out.println("Panorama listado por proceso");
        return getHibernateTemplate().find("from Panorama pr where pr.proceso.idproceso = ?", proceso);
    }
    
    public List<Panorama> listadoPorProceso(int proceso) {
        System.out.println("Panorama listado por proceso");
        return getHibernateTemplate().find("from Panorama pr where pr.proceso.idproceso = ?", proceso);
    }
    
}
