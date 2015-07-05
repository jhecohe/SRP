/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.PanoramaBean;
import com.srp.dao.PanoramaImpDAO;
import com.srp.persistencia.Panorama;
import com.srp.persistencia.Proceso;
import com.srp.persistencia.Riesgo;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class PanoramaImpBO implements PanoramaIntBO {

    private PanoramaImpDAO panoramaDAO;
    private RiesgoImpBO riesgoBO;
    private ProcesoImpBO procesoBO;
    
    @Override
    public boolean agregar(PanoramaBean obj) {
        Panorama panorama = new Panorama();
        Proceso proceso = new Proceso();
        proceso.setIdproceso(obj.getProceso());
        Riesgo riesgoCausa = new Riesgo();
        Riesgo riesgoEfecto = new Riesgo();
        riesgoCausa.setIdriesgo(obj.getRiesgoByIdcausa());
        riesgoEfecto.setIdriesgo(obj.getRiesgoByIdefecto());
        panorama.setRiesgoByIdcausa(riesgoCausa);
        panorama.setRiesgoByIdefecto(riesgoEfecto);
        panorama.setProceso(proceso);
        getPanoramaDAO().agregar(panorama);
        return true;
    }

    @Override
    public boolean actualizar(Panorama obj) {
        getPanoramaDAO().actualizar(obj);
        return true;
    }

    @Override
    public List<Panorama> listado() {
        return getPanoramaDAO().listado();
    }
    
    public List<Riesgo> riesgoListado(){
        return getRiesgoBO().listado();
    }
    
    public List<Proceso> procesoListado(){
        return getProcesoBO().listado();
    }

    public List<Proceso> procesoPorIdListado(int proceso) {
        return getProcesoBO().procesoPorIdListado(proceso);
    }
    
    public List<Panorama> panoramaPorRiesgo(int riesgo) {
        return getPanoramaDAO().listadoPorProceso(riesgo);
    }
    
    public List<Panorama> panoramaPorProceso(int proceso) {
        return getPanoramaDAO().listadoPorProceso(proceso);
    }
    
    /**
     * @return the panoramaDAO
     */
    public PanoramaImpDAO getPanoramaDAO() {
        return panoramaDAO;
    }

    /**
     * @param panorama the panoramaDAO to set
     */
    public void setPanoramaDAO(PanoramaImpDAO panorama) {
        this.panoramaDAO = panorama;
    }

    /**
     * @return the riesgoBO
     */
    public RiesgoImpBO getRiesgoBO() {
        return riesgoBO;
    }

    /**
     * @param riesgoBO the riesgoBO to set
     */
    public void setRiesgoBO(RiesgoImpBO riesgoBO) {
        this.riesgoBO = riesgoBO;
    }

    /**
     * @return the procesoBO
     */
    public ProcesoImpBO getProcesoBO() {
        return procesoBO;
    }

    /**
     * @param procesoBO the procesoBO to set
     */
    public void setProcesoBO(ProcesoImpBO procesoBO) {
        this.procesoBO = procesoBO;
    }
}
