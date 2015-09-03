/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.ValoracionImpBO;
import com.srp.persistencia.Analisisvaloracion;
import java.io.Serializable;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class ValoracionBean implements Serializable {

    private int idanalisisvaloracion;
    private int panorama;
    private int origen;
    private int probabilidad;
    private int impacto;
    private int control;
    private String color;
    private int proceso;
    private ValoracionImpBO valoracionBO;
    private int calificacion;
    private int calificacion1;
    private int calificacion2;
    private String valoracion;
    public static boolean adicionar;
    public static boolean modificar;
    
    public void agregar(){
        System.out.println( "Panorama" + panorama+"-origen "+ origen +"-probabilidad "+ probabilidad
                +"-impacto"+ impacto +"-control"+ control +"-color"
                + color +"-idanalisisvaloracion "+ idanalisisvaloracion);
        getValoracionBO().agregar(this);
    }
    
    public void actualizar(RowEditEvent event){
        Analisisvaloracion valoracion = new Analisisvaloracion();
        getValoracionBO().actualizar(valoracion);
    }
    
    public List procesoListado(){
        return getValoracionBO().procesoListado();
    }
    
    public List panoramaPorProcesoListado(){
        System.out.println("Metodo PorProceso");
        return getValoracionBO().panoramaPorProcesoListado(proceso);
    }
    
    public List listado(){
        return getValoracionBO().listado();
    }
    
    public String color() {
        if (getCalificacion1() >= 1 && getCalificacion1() < 10|| getCalificacion2() >= 1 && getCalificacion2() < 40) {
            color = "background-color: palegreen";
            setValoracion("bajo");
            return color;
        }
        if (getCalificacion1() >= 10 && getCalificacion1() < 15 || getCalificacion2() >= 40 && getCalificacion2() < 60) {
            color = "background-color: greenyellow";
            setValoracion("bajo");
            return color;
        }
        if (getCalificacion1() >= 15 && getCalificacion1() < 30 || getCalificacion2() >= 60 && getCalificacion2() < 80) {
            color = "background-color: yellow";
            setValoracion("medio");
            return color;
        }
        if (getCalificacion1() >= 30 && getCalificacion1() < 60 || getCalificacion2() >= 80 && getCalificacion2() < 100) {
            color = "background-color: red";
            setValoracion("medio");
            return color;
        }
        if (getCalificacion1() >= 60 || getCalificacion2() >= 120) {
            color = "background-color: darkgray";
            setValoracion("alto");
        }
        return color;
    }
    
    public void calificacion1() {
        System.out.println("calificacion" + origen + "" + probabilidad + "" + impacto);
        calificacion1 = origen * probabilidad * impacto;
        calificacion2 = calificacion1 * calificacion;
    }

    public void calificacion2() {
        System.out.println("calificacion2  " + calificacion1 + " , " + calificacion + " , " + panorama);
        calificacion2 = calificacion1 * calificacion;
    }

    /**
     * @return the idanalisisvaloracion
     */
    public int getIdanalisisvaloracion() {
        return idanalisisvaloracion;
    }

    /**
     * @param idanalisisvaloracion the idanalisisvaloracion to set
     */
    public void setIdanalisisvaloracion(int idanalisisvaloracion) {
        this.idanalisisvaloracion = idanalisisvaloracion;
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
     * @return the origen
     */
    public int getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(int origen) {
        this.origen = origen;
    }

    /**
     * @return the probabilidad
     */
    public int getProbabilidad() {
        return probabilidad;
    }

    /**
     * @param probabilidad the probabilidad to set
     */
    public void setProbabilidad(int probabilidad) {
        this.probabilidad = probabilidad;
    }

    /**
     * @return the impacto
     */
    public int getImpacto() {
        return impacto;
    }

    /**
     * @param impacto the impacto to set
     */
    public void setImpacto(int impacto) {
        this.impacto = impacto;
    }

    /**
     * @return the control
     */
    public int getControl() {
        return control;
    }

    /**
     * @param control the control to set
     */
    public void setControl(int control) {
        this.control = control;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the valoracionBO
     */
    public ValoracionImpBO getValoracionBO() {
        return valoracionBO;
    }

    /**
     * @param valoracionBO the valoracionBO to set
     */
    public void setValoracionBO(ValoracionImpBO valoracionBO) {
        this.valoracionBO = valoracionBO;
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
     * @return the calificacion
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return the calificacion1
     */
    public int getCalificacion1() {
        return calificacion1;
    }

    /**
     * @param calificacion1 the calificacion1 to set
     */
    public void setCalificacion1(int calificacion1) {
        this.calificacion1 = calificacion1;
    }

    /**
     * @return the calificacion2
     */
    public int getCalificacion2() {
        return calificacion2;
    }

    /**
     * @param calificacion2 the calificacion2 to set
     */
    public void setCalificacion2(int calificacion2) {
        this.calificacion2 = calificacion2;
    }

    /**
     * @return the valoracion
     */
    public String getValoracion() {
        return valoracion;
    }

    /**
     * @param valoracion the valoracion to set
     */
    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    /**
     * @return the adicionar
     */
    public boolean isAdicionar() {
        return adicionar;
    }

    /**
     * @param adicionar the adicionar to set
     */
    public void setAdicionar(boolean adicionar) {
        this.adicionar = adicionar;
    }

    /**
     * @return the modificar
     */
    public boolean isModificar() {
        return modificar;
    }

    /**
     * @param modificar the modificar to set
     */
    public void setModificar(boolean modificar) {
        this.modificar = modificar;
    }
}
