/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.PanoramaImpBO;
import com.srp.persistencia.Panorama;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class PanoramaBean {

    private int idpanorama;
    private int riesgoByIdefecto;
    private int proceso;
    private int riesgoByIdcausa;
    private Panorama seleccion;
    private PanoramaImpBO panoramaBO;
    public static boolean vusual;
    
    public void agregar(){
        getPanoramaBO().agregar(this);
    }
    
    public void actualizar(RowEditEvent event){
        Panorama panorama = (Panorama) event.getObject();
        getPanoramaBO().actualizar(panorama);
    }
    
    public List listado(){
        return getPanoramaBO().listado();
    }
    
    public List panormaPorRiesgo(){
        return getPanoramaBO().panoramaPorRiesgo(proceso);
    }
    public List riesgoListado(){
        return getPanoramaBO().riesgoListado();
    }
    
    public List procesoListado(){
        return getPanoramaBO().procesoListado();
    }
    
    public List procesoPorIdListasdo(){
        return getPanoramaBO().procesoPorIdListado(proceso);
    }

    /**
     * @return the idpanorama
     */
    public int getIdpanorama() {
        return idpanorama;
    }

    /**
     * @param idpanorama the idpanorama to set
     */
    public void setIdpanorama(int idpanorama) {
        this.idpanorama = idpanorama;
    }

    /**
     * @return the riesgoByIdefecto
     */
    public int getRiesgoByIdefecto() {
        return riesgoByIdefecto;
    }

    /**
     * @param riesgoByIdefecto the riesgoByIdefecto to set
     */
    public void setRiesgoByIdefecto(int riesgoByIdefecto) {
        this.riesgoByIdefecto = riesgoByIdefecto;
    }

    /**
     * @return the proceso
     */
    public int getProceso() {
        return proceso;
    }

    /**
     * @param proceso the proceso to set
     */
    public void setProceso(int proceso) {
        this.proceso = proceso;
    }

    /**
     * @return the riesgoByIdcausa
     */
    public int getRiesgoByIdcausa() {
        return riesgoByIdcausa;
    }

    /**
     * @param riesgoByIdcausa the riesgoByIdcausa to set
     */
    public void setRiesgoByIdcausa(int riesgoByIdcausa) {
        this.riesgoByIdcausa = riesgoByIdcausa;
    }

    /**
     * @return the panoramaBO
     */
    public PanoramaImpBO getPanoramaBO() {
        return panoramaBO;
    }

    /**
     * @param panoramaBO the panoramaBO to set
     */
    public void setPanoramaBO(PanoramaImpBO panoramaBO) {
        this.panoramaBO = panoramaBO;
    }

    /**
     * @return the seleccion
     */
    public Panorama getSeleccion() {
        return seleccion;
    }

    /**
     * @param seleccion the seleccion to set
     */
    public void setSeleccion(Panorama seleccion) {
        this.seleccion = seleccion;
    }

    /**
     * @return the vusual
     */
    public boolean isVusual() {
        return vusual;
    }

    /**
     * @param vusual the vusual to set
     */
    public void setVusual(boolean vusual) {
        this.vusual = vusual;
    }
    
}
