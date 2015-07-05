/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.EstadoImpBO;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class EstadoBean {

    private int idestado;
    private String descestado;
    private EstadoImpBO estadoBO;
    
    public void agregar (){
        getEstadoBO().agregar(this);
    }
    
    public void actualizar (){
        getEstadoBO().actualizar(this);
    }
    
    public void eliminar (){
        getEstadoBO().eliminar(this);
    }
    
    public List listado (){
        List estados = getEstadoBO().listado();
        return estados;
    }

    /**
     * @return the idestado
     */
    public int getIdestado() {
        return idestado;
    }

    /**
     * @param idestado the idestado to set
     */
    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    /**
     * @return the descestado
     */
    public String getDescestado() {
        return descestado;
    }

    /**
     * @param descestado the descestado to set
     */
    public void setDescestado(String descestado) {
        this.descestado = descestado;
    }

    /**
     * @return the estadoBO
     */
    public EstadoImpBO getEstadoBO() {
        return estadoBO;
    }

    /**
     * @param estadoBO the estadoBO to set
     */
    public void setEstadoBO(EstadoImpBO estadoBO) {
        this.estadoBO = estadoBO;
    }
}
