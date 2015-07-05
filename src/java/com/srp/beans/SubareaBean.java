/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.SubareaImpBO;
import com.srp.persistencia.Subarea;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class SubareaBean {

    private int idsubarea;
    private int ciudad;
    private int area;
    private String codigosubarea;
    private String descsubarea;
    private SubareaImpBO subareaBO;
    
    public void agregar(){
        getSubareaBO().agregar(this);
    }
    
    public void actualizar(RowEditEvent event){
        Subarea subarea = (Subarea) event.getObject();
        getSubareaBO().actualizar(subarea, descsubarea);
    }
    
    public void eliminar(RowEditEvent event){
        Subarea subaera = (Subarea) event.getObject();
        getSubareaBO().eleminar(subaera);
    }
    
    public List<Subarea> listado (){
        return getSubareaBO().listado();
    }

    /**
     * @return the idsubarea
     */
    public int getIdsubarea() {
        return idsubarea;
    }

    /**
     * @param idsubarea the idsubarea to set
     */
    public void setIdsubarea(int idsubarea) {
        this.idsubarea = idsubarea;
    }

    /**
     * @return the ciudad
     */
    public int getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the area
     */
    public int getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * @return the codigosubarea
     */
    public String getCodigosubarea() {
        return codigosubarea;
    }

    /**
     * @param codigosubarea the codigosubarea to set
     */
    public void setCodigosubarea(String codigosubarea) {
        this.codigosubarea = codigosubarea;
    }

    /**
     * @return the descsubarea
     */
    public String getDescsubarea() {
        return descsubarea;
    }

    /**
     * @param descsubarea the descsubarea to set
     */
    public void setDescsubarea(String descsubarea) {
        this.descsubarea = descsubarea;
    }

    /**
     * @return the subareaBO
     */
    public SubareaImpBO getSubareaBO() {
        return subareaBO;
    }

    /**
     * @param subareaBO the subareaBO to set
     */
    public void setSubareaBO(SubareaImpBO subareaBO) {
        this.subareaBO = subareaBO;
    }
}
