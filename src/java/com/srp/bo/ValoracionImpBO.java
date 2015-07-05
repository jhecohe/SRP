/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.ValoracionBean;
import com.srp.persistencia.Analisisvaloracion;
import com.srp.dao.ValoracionImpDAO;
import com.srp.persistencia.Panorama;
import com.srp.persistencia.Proceso;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class ValoracionImpBO implements ValoracionIntBO {
    
    private ValoracionImpDAO valoracionDAO;
    private ProcesoImpBO procesoBO;
    private RiesgoImpBO riesgoBO;
    private PanoramaImpBO panoramaBO;

    @Override
    public boolean agregar(ValoracionBean obj) {
        System.out.println( "Panorama" +obj.getPanorama()+"origen "+ obj.getOrigen()+"probabilidad"+ obj.getProbabilidad()
                +"impacto"+ obj.getImpacto()+"control"+ obj.getControl()+"color"+ obj.getColor()+"idanalisisvaloracion "+ obj.getIdanalisisvaloracion());
        Panorama panorama = new Panorama();
        panorama.setIdpanorama(obj.getPanorama());
        Analisisvaloracion valoracion = new Analisisvaloracion();
        valoracion.setColor(obj.color());
        valoracion.setControl(obj.getControl());
        valoracion.setImpacto(obj.getImpacto());
        valoracion.setOrigen(obj.getOrigen());
        valoracion.setProbabilidad(obj.getProbabilidad());
        valoracion.setPanorama(panorama);
        valoracionDAO.agregar(valoracion);
        return true;
    }

    @Override
    public boolean actualizar(Analisisvaloracion obj) {
        getValoracionDAO().actualizar(obj);
        return true;
    }

    @Override
    public List<Analisisvaloracion> listado() {
        return getValoracionDAO().listado();
    }
    
    public List<Proceso> procesoListado() {
        return getProcesoBO().listado();
    }
    
    public List<Panorama> panoramaPorProcesoListado(int proceso){
        return getPanoramaBO().panoramaPorRiesgo(proceso);
    }

    /**
     * @return the valoracionDAO
     */
    public ValoracionImpDAO getValoracionDAO() {
        return valoracionDAO;
    }

    /**
     * @param valoracionDAO the valoracionDAO to set
     */
    public void setValoracionDAO(ValoracionImpDAO valoracionDAO) {
        this.valoracionDAO = valoracionDAO;
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
}
