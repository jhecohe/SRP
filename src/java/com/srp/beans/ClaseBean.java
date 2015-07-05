/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.ClaseImpBO;
import com.srp.persistencia.Clase;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class ClaseBean {

    private int idclase;
    private String descclase;
    private ClaseImpBO claseBO;
    
    public void agregar(){
        getClaseBO().agregar(this);
    }
    
    public void actualizar(RowEditEvent event){
        Clase clase= (Clase) event.getObject();
    }
    
    public List listado(){
        return getClaseBO().listados();
    }

    /**
     * @return the idclase
     */
    public int getIdclase() {
        return idclase;
    }

    /**
     * @param idclase the idclase to set
     */
    public void setIdclase(int idclase) {
        this.idclase = idclase;
    }

    /**
     * @return the descclase
     */
    public String getDescclase() {
        return descclase;
    }

    /**
     * @param descclase the descclase to set
     */
    public void setDescclase(String descclase) {
        this.descclase = descclase;
    }

    /**
     * @return the claseBO
     */
    public ClaseImpBO getClaseBO() {
        return claseBO;
    }

    /**
     * @param claseBO the claseBO to set
     */
    public void setClaseBO(ClaseImpBO claseBO) {
        this.claseBO = claseBO;
    }
}
