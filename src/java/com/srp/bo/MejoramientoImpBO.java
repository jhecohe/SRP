/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.MejoramientoBean;
import com.srp.dao.MejoramientoImpDAO;
import com.srp.persistencia.Estadomejora;
import com.srp.persistencia.Funcionario;
import com.srp.persistencia.Panorama;
import com.srp.persistencia.Planmejoramiento;
import com.srp.persistencia.Proceso;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class MejoramientoImpBO implements MejoramientoIntBO {
    
    private MejoramientoImpDAO mejoramientoDAO;
    private ProcesoImpBO procesoBO;
    private PanoramaImpBO panoramaBO;
    private FuncionarioImpBO funcionarioBO;

    @Override
    public boolean agregar(MejoramientoBean obj) {
        System.out.println("hemos entrado al metodo agregar de la clase impBO");
        Planmejoramiento mejoramiento = new Planmejoramiento();
        Estadomejora estadomejora = new Estadomejora();
        estadomejora.setIdestadomejora(1);
        Panorama panorama = new Panorama();
        panorama.setIdpanorama(obj.getPanorama());
        Funcionario funcionario = new Funcionario();
        funcionario.setIdfuncionario(obj.getFuncionario());
        
        mejoramiento.setEstadomejora(estadomejora);
        mejoramiento.setPanorama(panorama);
        mejoramiento.setFuncionario(funcionario);
        mejoramiento.setResultado(obj.getResultado());
        mejoramiento.setMejoramiento(obj.getMejoramiento());
        mejoramiento.setFechainicio(obj.getFechainicio());
        mejoramiento.setFecharevision(obj.getFecharevision());
        System.out.println("fin del metodo agregar de la clase impBO");
        
        getMejoramientoDAO().agregar(mejoramiento);
        return true;
    }

    @Override
    public boolean actualizar(Planmejoramiento obj) {
        getMejoramientoDAO().actualizar(obj);
        return true;
    }

    @Override
    public List<Planmejoramiento> listado() {
        return getMejoramientoDAO().listado();
    }
    
    public List<Proceso> procesoListado() {
        return getProcesoBO().listado();
    }
    
    public List panoramaPorProcesoListado(int proceso) {
        return getPanoramaBO().panoramaPorProceso(proceso);
    }
    
    public List funcionarioPorSubArea(int panorama) {
        return getFuncionarioBO().listadoPorPanorama(panorama);
    }

    /**
     * @return the mejoramientoDAO
     */
    public MejoramientoImpDAO getMejoramientoDAO() {
        return mejoramientoDAO;
    }

    /**
     * @param mejoramientoDAO the mejoramientoDAO to set
     */
    public void setMejoramientoDAO(MejoramientoImpDAO mejoramientoDAO) {
        this.mejoramientoDAO = mejoramientoDAO;
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
     * @return the funcionarioBO
     */
    public FuncionarioImpBO getFuncionarioBO() {
        return funcionarioBO;
    }

    /**
     * @param funcionarioBO the funcionarioBO to set
     */
    public void setFuncionarioBO(FuncionarioImpBO funcionarioBO) {
        this.funcionarioBO = funcionarioBO;
    }
}
