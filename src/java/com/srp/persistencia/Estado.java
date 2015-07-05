package com.srp.persistencia;
// Generated 23/05/2015 08:59:36 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Estado generated by hbm2java
 */
public class Estado  implements java.io.Serializable {


     private int idestado;
     private String descestado;
     private Set procesos = new HashSet(0);
     private Set perfils = new HashSet(0);
     private Set riesgos = new HashSet(0);
     private Set funcionarios = new HashSet(0);

    public Estado() {
    }

	
    public Estado(int idestado, String descestado) {
        this.idestado = idestado;
        this.descestado = descestado;
    }
    public Estado(int idestado, String descestado, Set procesos, Set perfils, Set riesgos, Set funcionarios) {
       this.idestado = idestado;
       this.descestado = descestado;
       this.procesos = procesos;
       this.perfils = perfils;
       this.riesgos = riesgos;
       this.funcionarios = funcionarios;
    }
   
    public int getIdestado() {
        return this.idestado;
    }
    
    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }
    public String getDescestado() {
        return this.descestado;
    }
    
    public void setDescestado(String descestado) {
        this.descestado = descestado;
    }
    public Set getProcesos() {
        return this.procesos;
    }
    
    public void setProcesos(Set procesos) {
        this.procesos = procesos;
    }
    public Set getPerfils() {
        return this.perfils;
    }
    
    public void setPerfils(Set perfils) {
        this.perfils = perfils;
    }
    public Set getRiesgos() {
        return this.riesgos;
    }
    
    public void setRiesgos(Set riesgos) {
        this.riesgos = riesgos;
    }
    public Set getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set funcionarios) {
        this.funcionarios = funcionarios;
    }




}


