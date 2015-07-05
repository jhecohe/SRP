/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.bo;

import com.srp.beans.ClasificacionBean;
import com.srp.dao.ClasificacionImpDAO;
import com.srp.persistencia.Clasificacion;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class ClasificacionImpBO {

    private ClasificacionImpDAO clasificacionDAO;

    public boolean agregar(ClasificacionBean obj) {
        Clasificacion clasificacion = new Clasificacion();
        clasificacion.setDescclasificacion(obj.getDescclasificacion());
        clasificacion.setIdclasificacion(obj.getIdclasificacion());
        getClasificacionDAO().agregar(clasificacion);
        return true;
    }

    public boolean actualizar(ClasificacionBean obj) {
        Clasificacion clasificacion = new Clasificacion();
        clasificacion.setDescclasificacion(obj.getDescclasificacion());
        clasificacion.setIdclasificacion(obj.getIdclasificacion());
        getClasificacionDAO().actualizar(clasificacion);
        return true;
    }

    public List listado() {
        System.out.println("clasificacionBO metodo listado");
        List clasificacion = getClasificacionDAO().listado();
        return clasificacion;
    }

    /**
     * @return the clasificacionDAO
     */
    public ClasificacionImpDAO getClasificacionDAO() {
        return clasificacionDAO;
    }

    /**
     * @param clasificacionDAO the clasificacionDAO to set
     */
    public void setClasificacionDAO(ClasificacionImpDAO clasificacionDAO) {
        this.clasificacionDAO = clasificacionDAO;
    }

}
