/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Proceso;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import reportes.MapaRiesgos;

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
    
    public List<MapaRiesgos> listadoMapa(int riesgo){
        List<Proceso> procesoByRiesgo;
        Proceso proceso;
        List<MapaRiesgos> listado = new ArrayList();
        List <List> temp = getHibernateTemplate().find("select new list (pa.proceso.idproceso,"
                + " pa.riesgoByIdefecto.idriesgo, pro.funcionario.idfuncionario, "
                + "pro.procesoasociado.idprocesoasociado, pro.procesoasociado.descasociado, "
                + "pro.procesoasociado.nombreproceso.tipoproceso.desctipo)  from  Panorama pa,"
                + " Proceso pro where idcausa = ? and pa.proceso.idproceso = pro.idproceso", riesgo);
        for (int i = 0; i < temp.size(); i++) {
            MapaRiesgos mapa = new MapaRiesgos();
            mapa.setIdproceso((int)temp.get(i).get(1)); 
            mapa.setDescriesgo(temp.get(i).get(2).toString()); 
            mapa.setIdfuncionario((int)temp.get(i).get(3)); 
            mapa.setDescasociado(temp.get(i).get(4).toString()); 
            listado.add(mapa);
            System.out.println("Print mapa descasociado"+ temp.get(i).get(0));
        }
        
        return listado;
    }

    public List<Proceso> procesoPorIdListado(int proceso) {
        return getHibernateTemplate().find("from Proceso where id = ?", proceso);
    }
    
}
