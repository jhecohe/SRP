/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.SeccionalImpBO;
import com.srp.persistencia.Seccional;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class SeccionalBean {

    private int idseccional;
    private int regional;
    private String codigoseccional;
    private String descseccional;
    private SeccionalImpBO seccionalBO;
    
    public void agregar(){
        getSeccionalBO().agregar(this);
    }
    
    public void actualizar(RowEditEvent event){
        Seccional seccional = (Seccional) event.getObject();
        getSeccionalBO().actualizar(seccional, descseccional);
    }
    
    public void eliminar(RowEditEvent event){
        Seccional seccional = (Seccional) event.getObject();
        getSeccionalBO().eliminar(seccional);
    }

    public List listado(){
       return getSeccionalBO().listado();
    }
    /**
     * @return the idseccional
     */
    public int getIdseccional() {
        return idseccional;
    }

    /**
     * @param idseccional the idseccional to set
     */
    public void setIdseccional(int idseccional) {
        this.idseccional = idseccional;
    }

    /**
     * @return the regional
     */
    public int getRegional() {
        return regional;
    }

    /**
     * @param regional the regional to set
     */
    public void setRegional(int regional) {
        this.regional = regional;
    }

    /**
     * @return the codigoseccional
     */
    public String getCodigoseccional() {
        return codigoseccional;
    }

    /**
     * @param codigoseccional the codigoseccional to set
     */
    public void setCodigoseccional(String codigoseccional) {
        this.codigoseccional = codigoseccional;
    }

    /**
     * @return the descseccional
     */
    public String getDescseccional() {
        return descseccional;
    }

    /**
     * @param descseccional the descseccional to set
     */
    public void setDescseccional(String descseccional) {
        this.descseccional = descseccional;
    }

    /**
     * @return the seccionalBO
     */
    public SeccionalImpBO getSeccionalBO() {
        return seccionalBO;
    }

    /**
     * @param seccionalBO the seccionalBO to set
     */
    public void setSeccionalBO(SeccionalImpBO seccionalBO) {
        this.seccionalBO = seccionalBO;
    }
}
