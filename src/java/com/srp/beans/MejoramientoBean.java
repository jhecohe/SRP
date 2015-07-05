/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.MejoramientoImpBO;
import com.srp.persistencia.Planmejoramiento;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class MejoramientoBean implements Serializable {

    private int idmejoramiento;
    private int estadomejora;
    private int panorama;
    private int panoramabusqueda;
    private int funcionario;
    private int resultado;
    private String mejoramiento;
    private Date fechainicio = new Date();
    private Date fecharevision;
    private int proceso;
    private int riesgo;
    private Date actual = new Date();
    private MejoramientoImpBO mejoramientoBO;
    
    public void agregar(){
        System.out.println("panorama  " + panorama);
        getMejoramientoBO().agregar(this);
    }
    
    public void actualizar(RowEditEvent event){
        Planmejoramiento mejora = new Planmejoramiento();
        getMejoramientoBO().actualizar(mejora);
    }
    
    public List listado(){
        return getMejoramientoBO().listado();
    }
    
    public List procesoListado(){
        return getMejoramientoBO().procesoListado();
    }
    
    public List panoramaPorProcesoListado(){
        return getMejoramientoBO().panoramaPorProcesoListado(proceso);
    }
    
    public List funcionarioPorSubArea(){
        return getMejoramientoBO().funcionarioPorSubArea(panorama);
    }
    
    /**
     * @return the idmejoramiento
     */
    public int getIdmejoramiento() {
        return idmejoramiento;
    }

    /**
     * @param idmejoramiento the idmejoramiento to set
     */
    public void setIdmejoramiento(int idmejoramiento) {
        this.idmejoramiento = idmejoramiento;
    }

    /**
     * @return the estadomejora
     */
    public int getEstadomejora() {
        return estadomejora;
    }

    /**
     * @param estadomejora the estadomejora to set
     */
    public void setEstadomejora(int estadomejora) {
        this.estadomejora = estadomejora;
    }

    /**
     * @return the panorama
     */
    public int getPanorama() {
        return panorama;
    }

    /**
     * @param panorama the panorama to set
     */
    public void setPanorama(int panorama) {
        this.panorama = panorama;
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
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the mejoramiento
     */
    public String getMejoramiento() {
        return mejoramiento;
    }

    /**
     * @param mejoramiento the mejoramiento to set
     */
    public void setMejoramiento(String mejoramiento) {
        this.mejoramiento = mejoramiento;
    }

    /**
     * @return the fechainicio
     */
    public Date getFechainicio() {
        return fechainicio;
    }

    /**
     * @param fechainicio the fechainicio to set
     */
    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    /**
     * @return the fecharevision
     */
    public Date getFecharevision() {
        return fecharevision;
    }

    /**
     * @param fecharevision the fecharevision to set
     */
    public void setFecharevision(Date fecharevision) {
        this.fecharevision = fecharevision;
    }

    /**
     * @return the mejoramientoBO
     */
    public MejoramientoImpBO getMejoramientoBO() {
        return mejoramientoBO;
    }

    /**
     * @param mejoramientoBO the mejoramientoBO to set
     */
    public void setMejoramientoBO(MejoramientoImpBO mejoramientoBO) {
        this.mejoramientoBO = mejoramientoBO;
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
     * @return the riesgo
     */
    public int getRiesgo() {
        return riesgo;
    }

    /**
     * @param riesgo the riesgo to set
     */
    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    /**
     * @return the actual
     */
    public Date getActual() {
        return actual;
    }

    /**
     * @param actual the actual to set
     */
    public void setActual(Date actual) {
        this.actual = actual;
    }

    /**
     * @return the panoramabusqueda
     */
    public int getPanoramabusqueda() {
        return panoramabusqueda;
    }

    /**
     * @param panoramabusqueda the panoramabusqueda to set
     */
    public void setPanoramabusqueda(int panoramabusqueda) {
        this.panoramabusqueda = panoramabusqueda;
    }

}
