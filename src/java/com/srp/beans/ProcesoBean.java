/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.ProcesoImpBO;
import com.srp.persistencia.Proceso;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class ProcesoBean implements Serializable {

    private int idproceso;
    private int estado;
    private int subarea;
    private int procesoasociado;
    private int funcionario;
    private String codigoproceso;
    private Date creado;
    private Date modificado;
    private ProcesoImpBO procesoBO;
    public static boolean visual;
    
    private int tipoproceso;
    private int nombreproceso;
    private int region;
    private int seccional;
    private int area;

    public void agregar() {
        getProcesoBO().agregar(this);
    }

    public void actualizar(RowEditEvent event, int idfuncionario, int idestado) {
        Proceso proceso = (Proceso) event.getObject();
        getProcesoBO().actualizar(proceso, idfuncionario, idestado);
    }

    public void eleminar() {
        getProcesoBO().eleminar(this);
    }

    public List<Proceso> listado() {
        List<Proceso> procesos = getProcesoBO().listado();
        return procesos;
    }
    
    public List tipoprocesoListado(){
        System.out.println("procesoBean listado tipoproceso");
        return getProcesoBO().tipoprocesoListado();
    }
    
    public List nombreprocesoPorTipoListado(){
        System.out.println("procesoBean listado nombreproceso por tipo");
        return getProcesoBO().nombreprocesoPorTipoListado(tipoproceso);
    }
    
    public List procesoasociadoPorNombreListado(){
        System.out.println("procesoBean listado procesoasociado por nombre" + nombreproceso);
        List asociados = getProcesoBO().procesoasociadoPorNombreListado(nombreproceso);
        if (asociados == null)
            System.out.println("El listado de asociados llego vacio");
        return asociados;
    }
    
    public List regionalListado(){
        return getProcesoBO().regionalListado();
    }
    
    public List seccionalPorRegionalListado(){
        return getProcesoBO().seccionalPorRegionalListado(region);
    }
    
    public List areaPorSeccionalListado(){
        return getProcesoBO().areaPorSeccionalListado(seccional);
    }
    
    public List subareaPorAreaListado(){
        return getProcesoBO().subareaPorAreaListado(area);
    }
    
    public List funcionarioPorSubareaListado(){
        System.out.println("ProcesoBean listado funcionario por subarea");
        return getProcesoBO().funcionarioPorSubarea(subarea);
    }
    
    public List estadoListado(){
        return getProcesoBO().estadoListado();
    }

    /**
     * @return the idproceso
     */
    public int getIdproceso() {
        return idproceso;
    }

    /**
     * @param idproceso the idproceso to set
     */
    public void setIdproceso(int idproceso) {
        this.idproceso = idproceso;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the subarea
     */
    public int getSubarea() {
        return subarea;
    }

    /**
     * @param subarea the subarea to set
     */
    public void setSubarea(int subarea) {
        this.subarea = subarea;
    }

    /**
     * @return the procesoasociado
     */
    public int getProcesoasociado() {
        return procesoasociado;
    }

    /**
     * @param procesoasociado the procesoasociado to set
     */
    public void setProcesoasociado(int procesoasociado) {
        this.procesoasociado = procesoasociado;
    }

    /**
     * @return the funcionario
     */
    public int getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the codigoproceso
     */
    public String getCodigoproceso() {
        return codigoproceso;
    }

    /**
     * @param codigoproceso the codigoproceso to set
     */
    public void setCodigoproceso(String codigoproceso) {
        this.codigoproceso = codigoproceso;
    }

    /**
     * @return the creado
     */
    public Date getCreado() {
        return creado;
    }

    /**
     * @param creado the creado to set
     */
    public void setCreado(Date creado) {
        this.creado = creado;
    }

    /**
     * @return the modificado
     */
    public Date getModificado() {
        return modificado;
    }

    /**
     * @param modificado the modificado to set
     */
    public void setModificado(Date modificado) {
        this.modificado = modificado;
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
     * @return the region
     */
    public int getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(int region) {
        this.region = region;
    }

    /**
     * @return the seccional
     */
    public int getSeccional() {
        return seccional;
    }

    /**
     * @param seccional the seccional to set
     */
    public void setSeccional(int seccional) {
        this.seccional = seccional;
    }

    /**
     * @return the area
     */
    public int getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * @return the visual
     */
    public boolean isVisual() {
        return visual;
    }

    /**
     * @param visual the visual to set
     */
    public void setVisual(boolean visual) {
        this.visual = visual;
    }
}
