package com.srp.persistencia;
// Generated 23/05/2015 08:59:36 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Procesoasociado generated by hbm2java
 */
public class Procesoasociado  implements java.io.Serializable {


     private int idprocesoasociado;
     private Nombreproceso nombreproceso;
     private String descasociado;
     private Set procesos = new HashSet(0);

    public Procesoasociado() {
    }

	
    public Procesoasociado(int idprocesoasociado, Nombreproceso nombreproceso, String descasociado) {
        this.idprocesoasociado = idprocesoasociado;
        this.nombreproceso = nombreproceso;
        this.descasociado = descasociado;
    }
    public Procesoasociado(int idprocesoasociado, Nombreproceso nombreproceso, String descasociado, Set procesos) {
       this.idprocesoasociado = idprocesoasociado;
       this.nombreproceso = nombreproceso;
       this.descasociado = descasociado;
       this.procesos = procesos;
    }
   
    public int getIdprocesoasociado() {
        return this.idprocesoasociado;
    }
    
    public void setIdprocesoasociado(int idprocesoasociado) {
        this.idprocesoasociado = idprocesoasociado;
    }
    public Nombreproceso getNombreproceso() {
        return this.nombreproceso;
    }
    
    public void setNombreproceso(Nombreproceso nombreproceso) {
        this.nombreproceso = nombreproceso;
    }
    public String getDescasociado() {
        return this.descasociado;
    }
    
    public void setDescasociado(String descasociado) {
        this.descasociado = descasociado;
    }
    public Set getProcesos() {
        return this.procesos;
    }
    
    public void setProcesos(Set procesos) {
        this.procesos = procesos;
    }




}


