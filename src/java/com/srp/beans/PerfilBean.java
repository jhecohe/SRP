/*
 * To change this license header, choose License Headers in Project Properties.
 * To change± this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.PerfilImpBO;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class PerfilBean implements Serializable {

    private int idperfil;
    private int estado;
    private String descperfil;
    private String[] proceso;
    private String[] funcionario;
    private String[] admin;
    private PerfilImpBO perfilBO;
    
    public void agregar(){
        getPerfilBO().agregar(this);
    }
    
    public List listado(){
        return getPerfilBO().listado();
    }
    
    public boolean actualizar(){
        
        //Se envian el vector y el perfil a la clase visualizar 
        visualizar();
        
        int tamaño = proceso.length + funcionario.length + admin.length;
        String[] modulo = new String[tamaño];
        System.arraycopy(proceso, 0, modulo, 0, proceso.length);
        System.arraycopy(funcionario, 0, modulo, proceso.length, funcionario.length);
        int puntero = proceso.length + funcionario.length;
        System.arraycopy(admin, 0, modulo, puntero, admin.length);
                
        try {
             getPerfilBO().actualizar(modulo, descperfil);
        } catch (Exception e) {
        }
        return true;
    }
    
    
    private void visualizar (){

        switch(descperfil){
            case "administrador":
                filtroOperador();
            case "operador":
                filtroOperador();
            case "dueño de proceso":
                filtroOperador();
            case "ejecutor de proceso":
                filtroOperador();
            case "gestor de riesgo":
                filtroOperador();
            case "auditor":
                filtroOperador();
        }
    }
    
    private String filtroOperador (){
        VisualOperador operador = new VisualOperador();
        for (int i = 0; i < proceso.length; i++) {
            switch (proceso[i]){
                case "riesgo":                   
                    operador.setVisualriesgo(Boolean.getBoolean(proceso[++i]));
                case "proceso":
                    operador.setVisualproceso(Boolean.getBoolean(proceso[++i]));
            } 
        }
        return "";
    }
       
    /**
     * @return the idperfil
     */
    public int getIdperfil() {
        return idperfil;
    }

    /**
     * @param idperfil the idperfil to set
     */
    public void setIdperfil(int idperfil) {
        this.idperfil = idperfil;
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
     * @return the descperfil
     */
    public String getDescperfil() {
        return descperfil;
    }

    /**
     * @param descperfil the descperfil to set
     */
    public void setDescperfil(String descperfil) {
        this.descperfil = descperfil;
    }

    /**
     * @return the perfilBO
     */
    public PerfilImpBO getPerfilBO() {
        return perfilBO;
    }

    /**
     * @param perfilBO the perfilBO to set
     */
    public void setPerfilBO(PerfilImpBO perfilBO) {
        this.perfilBO = perfilBO;
    }

    /**
     * @return the proceso
     */
    public String[] getProceso() {
        return proceso;
    }

    /**
     * @param proceso the proceso to set
     */
    public void setProceso(String[] proceso) {
        this.proceso = proceso;
    }

    /**
     * @return the funcionario
     */
    public String[] getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(String[] funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the admin
     */
    public String[] getAdmin() {
        return admin;
    }

    /**
     * @param admin the admin to set
     */
    public void setAdmin(String[] admin) {
        this.admin = admin;
    }
}
