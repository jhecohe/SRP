/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.beans;

import com.srp.bo.EnfoqueImpBO;
import com.srp.persistencia.Enfoque;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class EnfoqueBean {
    
    private int idenfoque;
    private String descenfoque;
    private EnfoqueImpBO enfoqueBO;
    
    public void agregar(){
        getEnfoqueBO().agregar(this);
    }
    
    public void actualizar(RowEditEvent e){
        Enfoque objeto = (Enfoque) e.getObject();
        getEnfoqueBO().actualizar(objeto, descenfoque);
    }
    
    public void eliminar(){
        getEnfoqueBO().eliminar(this);
    }
    
    public List listado(){
        List enfoques = getEnfoqueBO().listado();
        return enfoques;
    }

    /**
     * @return the idenfoque
     */
    public int getIdenfoque() {
        return idenfoque;
    }

    /**
     * @param idenfoque the idenfoque to set
     */
    public void setIdenfoque(int idenfoque) {
        this.idenfoque = idenfoque;
    }

    /**
     * @return the descenfoque
     */
    public String getDescenfoque() {
        return descenfoque;
    }

    /**
     * @param descenfoque the descenfoque to set
     */
    public void setDescenfoque(String descenfoque) {
        this.descenfoque = descenfoque;
    }

    /**
     * @return the enfoqueBO
     */
    public EnfoqueImpBO getEnfoqueBO() {
        return enfoqueBO;
    }

    /**
     * @param enfoqueBO the enfoqueBO to set
     */
    public void setEnfoqueBO(EnfoqueImpBO enfoqueBO) {
        this.enfoqueBO = enfoqueBO;
    }
}
