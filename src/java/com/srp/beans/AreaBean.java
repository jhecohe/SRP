/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.AreaImpBO;
import com.srp.persistencia.Area;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class AreaBean {

    private int idarea;
    private int seccional;
    private String codigoarea;
    private String descarea;
    private AreaImpBO areaBO;

    public void agregar(){
        getAreaBO().agragar(this);
    }
    
    public void actualizar(RowEditEvent event){
        Area area = (Area) event.getObject();
        getAreaBO().actualizar(area, descarea);
    }
    
    public void eliminar(RowEditEvent event){
        Area area = (Area) event.getObject();
        getAreaBO().eliminar(area);
    }
    
    public List<Area> listado(){
        return getAreaBO().listado();
    }
    /**
     * @return the idarea
     */
    public int getIdarea() {
        return idarea;
    }

    /**
     * @param idarea the idarea to set
     */
    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    /**
     * @return the seccional
     */
    public int getSeccional() {
        return seccional;
    }

    /**
     * @param seccional the seccional to set
     */
    public void setSeccional(int seccional) {
        this.seccional = seccional;
    }

    /**
     * @return the codigoarea
     */
    public String getCodigoarea() {
        return codigoarea;
    }

    /**
     * @param codigoarea the codigoarea to set
     */
    public void setCodigoarea(String codigoarea) {
        this.codigoarea = codigoarea;
    }

    /**
     * @return the descarea
     */
    public String getDescarea() {
        return descarea;
    }

    /**
     * @param descarea the descarea to set
     */
    public void setDescarea(String descarea) {
        this.descarea = descarea;
    }

    /**
     * @return the areaBO
     */
    public AreaImpBO getAreaBO() {
        return areaBO;
    }

    /**
     * @param areaBO the areaBO to set
     */
    public void setAreaBO(AreaImpBO areaBO) {
        this.areaBO = areaBO;
    }
}
