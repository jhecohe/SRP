/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.ClasificacionImpBO;
import com.srp.persistencia.Clasificacion;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class ClasificacionBean {

    private int idclasificacion;
    private String descclasificacion;
    private ClasificacionImpBO clasificacionBO;
    
    public void agregar(){
        getClasificacionBO().agregar(this);
    }
    
    public void actualizar (RowEditEvent event){
        Clasificacion objeto = (Clasificacion) event.getObject();
        System.out.println("clasificacion" + descclasificacion);
        getClasificacionBO().actualizar(objeto, descclasificacion);
    }
    
    public List clasificacionListado(){
        List clasificaciones = getClasificacionBO().listado();
        return clasificaciones;
    }

    /**
     * @return the idclasificacion
     */
    public int getIdclasificacion() {
        return idclasificacion;
    }

    /**
     * @param idclasificacion the idclasificacion to set
     */
    public void setIdclasificacion(int idclasificacion) {
        this.idclasificacion = idclasificacion;
    }

    /**
     * @return the descclasificacion
     */
    public String getDescclasificacion() {
        return descclasificacion;
    }

    /**
     * @param descclasificacion the descclasificacion to set
     */
    public void setDescclasificacion(String descclasificacion) {
        this.descclasificacion = descclasificacion;
    }

    /**
     * @return the clasificacionBO
     */
    public ClasificacionImpBO getClasificacionBO() {
        return clasificacionBO;
    }

    /**
     * @param clasificacionBO the clasificacionBO to set
     */
    public void setClasificacionBO(ClasificacionImpBO clasificacionBO) {
        this.clasificacionBO = clasificacionBO;
    }
}
