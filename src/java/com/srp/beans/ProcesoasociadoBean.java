/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.ProcesoasociadoImpBO;
import com.srp.persistencia.Procesoasociado;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class ProcesoasociadoBean {

    private int idprocesoasociado;
    private int nombreproceso;
    private String descasociado;
    private ProcesoasociadoImpBO procesoasociadoBO;
    
    public void agregar(){
        getProcesoasociadoBO().agregar(this);
    }
    
    public void actualizar(RowEditEvent event){
        Procesoasociado procesoasociado = (Procesoasociado) event.getObject();
        getProcesoasociadoBO().actualizar(procesoasociado, descasociado);
    }
    
    public void eliminar(RowEditEvent event){
        Procesoasociado procesoasociado = (Procesoasociado) event.getObject();
        getProcesoasociadoBO().eliminar(procesoasociado);
    }
    
    public List<Procesoasociado> listado(){
        return getProcesoasociadoBO().listado();
    }

    /**
     * @return the idprocesoasociado
     */
    public int getIdprocesoasociado() {
        return idprocesoasociado;
    }

    /**
     * @param idprocesoasociado the idprocesoasociado to set
     */
    public void setIdprocesoasociado(int idprocesoasociado) {
        this.idprocesoasociado = idprocesoasociado;
    }

    /**
     * @return the nombreproceso
     */
    public int getNombreproceso() {
        return nombreproceso;
    }

    /**
     * @param nombreproceso the nombreproceso to set
     */
    public void setNombreproceso(int nombreproceso) {
        this.nombreproceso = nombreproceso;
    }

    /**
     * @return the descasociado
     */
    public String getDescasociado() {
        return descasociado;
    }

    /**
     * @param descasociado the descasociado to set
     */
    public void setDescasociado(String descasociado) {
        this.descasociado = descasociado;
    }

    /**
     * @return the procesoasociadoBO
     */
    public ProcesoasociadoImpBO getProcesoasociadoBO() {
        return procesoasociadoBO;
    }

    /**
     * @param procesoasociadoBO the procesoasociadoBO to set
     */
    public void setProcesoasociadoBO(ProcesoasociadoImpBO procesoasociadoBO) {
        this.procesoasociadoBO = procesoasociadoBO;
    }
}
