/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Funcionario;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author jhecohe
 */
public class FuncionarioImpDAO extends HibernateDaoSupport implements FuncionarioIntDAO {

    @Override
    public boolean agregar(Funcionario obj) {
        getHibernateTemplate().save(obj);
        return true;
    }

    @Override
    public boolean actualizar(Funcionario obj) {
        getHibernateTemplate().update(obj);
        return true;
    }

    @Override
    public boolean eleminar(Funcionario obj) {
        getHibernateTemplate().delete(obj);
        return true;
    }

    @Override
    public List<Funcionario> listado() {
        return getHibernateTemplate().find("from Funcionario");
    }
    
    @Override
    public List<Funcionario> listado(int idsubarea) {
        System.out.println("FuncionaroDAO listado por subarea");
        return getHibernateTemplate().find("from Funcionario where idsubarea = ?", idsubarea);
    }

    public List<Funcionario> listadoPorPanorma(int idpanorama) {
        return getHibernateTemplate().find("from Funcionario");
    }
    
}
