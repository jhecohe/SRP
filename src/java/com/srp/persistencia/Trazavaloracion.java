package com.srp.persistencia;
// Generated 23/05/2015 08:59:36 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Trazavaloracion generated by hbm2java
 */
public class Trazavaloracion  implements java.io.Serializable {


     private int idtrazavaloracion;
     private Analisisvaloracion analisisvaloracion;
     private String proceso;
     private String riesgo;
     private int origin;
     private int probabilidad;
     private int impacto;
     private int control;
     private String usuariooperacion;
     private Date fechaoperacion;
     private String tipooperacion;

    public Trazavaloracion() {
    }

    public Trazavaloracion(int idtrazavaloracion, Analisisvaloracion analisisvaloracion, String proceso, String riesgo, int origin, int probabilidad, int impacto, int control, String usuariooperacion, Date fechaoperacion, String tipooperacion) {
       this.idtrazavaloracion = idtrazavaloracion;
       this.analisisvaloracion = analisisvaloracion;
       this.proceso = proceso;
       this.riesgo = riesgo;
       this.origin = origin;
       this.probabilidad = probabilidad;
       this.impacto = impacto;
       this.control = control;
       this.usuariooperacion = usuariooperacion;
       this.fechaoperacion = fechaoperacion;
       this.tipooperacion = tipooperacion;
    }
   
    public int getIdtrazavaloracion() {
        return this.idtrazavaloracion;
    }
    
    public void setIdtrazavaloracion(int idtrazavaloracion) {
        this.idtrazavaloracion = idtrazavaloracion;
    }
    public Analisisvaloracion getAnalisisvaloracion() {
        return this.analisisvaloracion;
    }
    
    public void setAnalisisvaloracion(Analisisvaloracion analisisvaloracion) {
        this.analisisvaloracion = analisisvaloracion;
    }
    public String getProceso() {
        return this.proceso;
    }
    
    public void setProceso(String proceso) {
        this.proceso = proceso;
    }
    public String getRiesgo() {
        return this.riesgo;
    }
    
    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }
    public int getOrigin() {
        return this.origin;
    }
    
    public void setOrigin(int origin) {
        this.origin = origin;
    }
    public int getProbabilidad() {
        return this.probabilidad;
    }
    
    public void setProbabilidad(int probabilidad) {
        this.probabilidad = probabilidad;
    }
    public int getImpacto() {
        return this.impacto;
    }
    
    public void setImpacto(int impacto) {
        this.impacto = impacto;
    }
    public int getControl() {
        return this.control;
    }
    
    public void setControl(int control) {
        this.control = control;
    }
    public String getUsuariooperacion() {
        return this.usuariooperacion;
    }
    
    public void setUsuariooperacion(String usuariooperacion) {
        this.usuariooperacion = usuariooperacion;
    }
    public Date getFechaoperacion() {
        return this.fechaoperacion;
    }
    
    public void setFechaoperacion(Date fechaoperacion) {
        this.fechaoperacion = fechaoperacion;
    }
    public String getTipooperacion() {
        return this.tipooperacion;
    }
    
    public void setTipooperacion(String tipooperacion) {
        this.tipooperacion = tipooperacion;
    }




}


