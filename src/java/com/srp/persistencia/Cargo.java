package com.srp.persistencia;
// Generated 23/05/2015 08:59:36 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Cargo generated by hbm2java
 */
public class Cargo  implements java.io.Serializable {


     private int idcargo;
     private String desccargo;
     private Set funcionarios = new HashSet(0);

    public Cargo() {
    }

	
    public Cargo(int idcargo, String desccargo) {
        this.idcargo = idcargo;
        this.desccargo = desccargo;
    }
    public Cargo(int idcargo, String desccargo, Set funcionarios) {
       this.idcargo = idcargo;
       this.desccargo = desccargo;
       this.funcionarios = funcionarios;
    }
   
    public int getIdcargo() {
        return this.idcargo;
    }
    
    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
    }
    public String getDesccargo() {
        return this.desccargo;
    }
    
    public void setDesccargo(String desccargo) {
        this.desccargo = desccargo;
    }
    public Set getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set funcionarios) {
        this.funcionarios = funcionarios;
    }




}


