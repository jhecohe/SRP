/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.RegionalImpBO;
import com.srp.persistencia.Regional;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class RegionalBean {

    private int idregional;
    private String codigoregional;
    private String descregional;
    private RegionalImpBO regionalBO;
    
    public void agregar(){
        getRegionalBO().agregar(this);
    }
    
    public void actualizar(RowEditEvent event){
        Regional regional= (Regional) event.getObject();
        getRegionalBO().actualizar(regional, descregional);
    }
    
    public void eliminar(RowEditEvent event){
        Regional regional= (Regional) event.getObject();
        getRegionalBO().eleminar(regional);
    }
    
    public List<Regional> listado(){
        return getRegionalBO().listado();
    }

    /**
     * @return the idregional
     */
    public int getIdregional() {
        return idregional;
    }

    /**
     * @param idregional the idregional to set
     */
    public void setIdregional(int idregional) {
        this.idregional = idregional;
    }

    /**
     * @return the codigoregional
     */
    public String getCodigoregional() {
        return codigoregional;
    }

    /**
     * @param codigoregional the codigoregional to set
     */
    public void setCodigoregional(String codigoregional) {
        this.codigoregional = codigoregional;
    }

    /**
     * @return the descregional
     */
    public String getDescregional() {
        return descregional;
    }

    /**
     * @param descregional the descregional to set
     */
    public void setDescregional(String descregional) {
        this.descregional = descregional;
    }

    /**
     * @return the regionalBO
     */
    public RegionalImpBO getRegionalBO() {
        return regionalBO;
    }

    /**
     * @param regionalBO the regionalBO to set
     */
    public void setRegionalBO(RegionalImpBO regionalBO) {
        this.regionalBO = regionalBO;
    }
}
