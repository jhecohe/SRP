/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.NombreprocesoImpBO;
import com.srp.persistencia.Tipoproceso;

/**
 *
 * @author jhecohe
 */
public class NombreprocesoBean {

    private int idnombreproceso;
    private int tipoproceso;
    private String descnombre;
    private NombreprocesoImpBO nombreprocesoBO;

    /**
     * @return the idnombreproceso
     */
    public int getIdnombreproceso() {
        return idnombreproceso;
    }

    /**
     * @param idnombreproceso the idnombreproceso to set
     */
    public void setIdnombreproceso(int idnombreproceso) {
        this.idnombreproceso = idnombreproceso;
    }

    /**
     * @return the tipoproceso
     */
    public int getTipoproceso() {
        return tipoproceso;
    }

    /**
     * @param tipoproceso the tipoproceso to set
     */
    public void setTipoproceso(int tipoproceso) {
        this.tipoproceso = tipoproceso;
    }

    /**
     * @return the descnombre
     */
    public String getDescnombre() {
        return descnombre;
    }

    /**
     * @param descnombre the descnombre to set
     */
    public void setDescnombre(String descnombre) {
        this.descnombre = descnombre;
    }

    /**
     * @return the nombreprocesoBO
     */
    public NombreprocesoImpBO getNombreprocesoBO() {
        return nombreprocesoBO;
    }

    /**
     * @param nombreprocesoBO the nombreprocesoBO to set
     */
    public void setNombreprocesoBO(NombreprocesoImpBO nombreprocesoBO) {
        this.nombreprocesoBO = nombreprocesoBO;
    }
}
