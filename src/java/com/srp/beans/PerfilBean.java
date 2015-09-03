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
    private boolean riesgoAdicionar;
    private boolean riesgoModificar;
    private boolean procesoAdicionar;
    private boolean procesoModificar;
    private boolean panormaAdicionar;
    private boolean panormaModificar;
    private boolean valoracionAdicionar;
    private boolean valoracionModificar;
    private boolean mejoramientoAdicionar;
    private boolean mejoramientoModificar;
    
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
                
                break;
            case "operador":
                OperadorVisual.riesgoAdicion = isRiesgoAdicionar();
                OperadorVisual.riesgoModificacion = isRiesgoModificar();
                OperadorVisual.procesoAdicion = isProcesoAdicionar();
                OperadorVisual.procesoModificacion = isProcesoModificar();
                OperadorVisual.panoramaAdicion = isPanormaAdicionar();
                OperadorVisual.panoramaModificacion = isPanormaModificar();
                OperadorVisual.valoracionAdicion = isValoracionAdicionar();
                OperadorVisual.valoracionModificacion = isValoracionModificar();
                OperadorVisual.mejoramientoAdicion = isMejoramientoAdicionar();
                OperadorVisual.mejoramientoModificacion = isMejoramientoModificar();
                break;
            case "dueño de proceso":
                DuenoVisual.riesgoAdicion = isRiesgoAdicionar();
                DuenoVisual.riesgoModificacion = isRiesgoModificar();
                DuenoVisual.procesoAdicion = isProcesoAdicionar();
                DuenoVisual.procesoModificacion = isProcesoModificar();
                DuenoVisual.panoramaAdicion = isPanormaAdicionar();
                DuenoVisual.panoramaModificacion = isPanormaModificar();
                DuenoVisual.valoracionAdicion = isValoracionAdicionar();
                DuenoVisual.valoracionModificacion = isValoracionModificar();
                DuenoVisual.mejoramientoAdicion = isMejoramientoAdicionar();
                DuenoVisual.mejoramientoModificacion = isMejoramientoModificar(); 
                break;
            case "ejecutor de proceso":
                EjecutorVisual.riesgoAdicion = isRiesgoAdicionar();
                EjecutorVisual.riesgoModificacion = isRiesgoModificar();
                EjecutorVisual.procesoAdicion = isProcesoAdicionar();
                EjecutorVisual.procesoModificacion = isProcesoModificar();
                EjecutorVisual.panoramaAdicion = isPanormaAdicionar();
                EjecutorVisual.panoramaModificacion = isPanormaModificar();
                EjecutorVisual.valoracionAdicion = isValoracionAdicionar();
                EjecutorVisual.valoracionModificacion = isValoracionModificar();
                EjecutorVisual.mejoramientoAdicion = isMejoramientoAdicionar();
                EjecutorVisual.mejoramientoModificacion = isMejoramientoModificar();
                break;
            case "gestor de riesgo":
                GestorVisual.riesgoAdicion = isRiesgoAdicionar();
                GestorVisual.riesgoModificacion = isRiesgoModificar();
                GestorVisual.procesoAdicion = isProcesoAdicionar();
                GestorVisual.procesoModificacion = isProcesoModificar();
                GestorVisual.panoramaAdicion = isPanormaAdicionar();
                GestorVisual.panoramaModificacion = isPanormaModificar();
                GestorVisual.valoracionAdicion = isValoracionAdicionar();
                GestorVisual.valoracionModificacion = isValoracionModificar();
                GestorVisual.mejoramientoAdicion = isMejoramientoAdicionar();
                GestorVisual.mejoramientoModificacion = isMejoramientoModificar();
                break;
            case "auditor":
                AuditorVisual.riesgoAdicion = isRiesgoAdicionar();
                AuditorVisual.riesgoModificacion = isRiesgoModificar();
                AuditorVisual.procesoAdicion = isProcesoAdicionar();
                AuditorVisual.procesoModificacion = isProcesoModificar();
                AuditorVisual.panoramaAdicion = isPanormaAdicionar();
                AuditorVisual.panoramaModificacion = isPanormaModificar();
                AuditorVisual.valoracionAdicion = isValoracionAdicionar();
                AuditorVisual.valoracionModificacion = isValoracionModificar();
                AuditorVisual.mejoramientoAdicion = isMejoramientoAdicionar();
                AuditorVisual.mejoramientoModificacion = isMejoramientoModificar();
                break;
        }
    }
    
    private String filtroOperador (){
//        System.out.println("Metodo filtro operador");
//        for (int i = 0; i < proceso.length; i++) {
//            System.out.println("Ciclo  "+ proceso[i]);
//            switch (proceso[i]){
//                case "riesgo":                   
//                    VisualOperador.visualriesgo = Boolean.parseBoolean(proceso[++i]);
////                    System.out.println("case" + Boolean.parseBoolean(proceso[++i]));
////                    VisualOperador.visualriesgo = false;
//                    System.out.println("case riesgo" + VisualOperador.visualriesgo);
//                    break;
//                case "proceso":
////                    operador.setVisualproceso(Boolean.getBoolean(proceso[++i]));
//                    break;
//                case "panorama":
////                    operador.setVisualpanorama(Boolean.getBoolean(proceso[++i]));
//                    break;
//                case "valoracion":
////                    operador.setVisualvaloracion(Boolean.getBoolean(proceso[++i]));
//                    break;
//                case "mejoramiento":
////                    operador.setVisualmejoramiento(Boolean.getBoolean(proceso[++i]));
//                    break;
//            } 
//        }
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

    /**
     * @return the riesgoAdicionar
     */
    public boolean isRiesgoAdicionar() {
        return riesgoAdicionar;
    }

    /**
     * @param riesgoAdicionar the riesgoAdicionar to set
     */
    public void setRiesgoAdicionar(boolean riesgoAdicionar) {
        this.riesgoAdicionar = riesgoAdicionar;
    }

    /**
     * @return the riesgoModificar
     */
    public boolean isRiesgoModificar() {
        return riesgoModificar;
    }

    /**
     * @param riesgoModificar the riesgoModificar to set
     */
    public void setRiesgoModificar(boolean riesgoModificar) {
        this.riesgoModificar = riesgoModificar;
    }

    /**
     * @return the procesoAdicionar
     */
    public boolean isProcesoAdicionar() {
        return procesoAdicionar;
    }

    /**
     * @param procesoAdicionar the procesoAdicionar to set
     */
    public void setProcesoAdicionar(boolean procesoAdicionar) {
        this.procesoAdicionar = procesoAdicionar;
    }

    /**
     * @return the procesoModificar
     */
    public boolean isProcesoModificar() {
        return procesoModificar;
    }

    /**
     * @param procesoModificar the procesoModificar to set
     */
    public void setProcesoModificar(boolean procesoModificar) {
        this.procesoModificar = procesoModificar;
    }

    /**
     * @return the panormaAdicionar
     */
    public boolean isPanormaAdicionar() {
        return panormaAdicionar;
    }

    /**
     * @param panormaAdicionar the panormaAdicionar to set
     */
    public void setPanormaAdicionar(boolean panormaAdicionar) {
        this.panormaAdicionar = panormaAdicionar;
    }

    /**
     * @return the panormaModificar
     */
    public boolean isPanormaModificar() {
        return panormaModificar;
    }

    /**
     * @param panormaModificar the panormaModificar to set
     */
    public void setPanormaModificar(boolean panormaModificar) {
        this.panormaModificar = panormaModificar;
    }

    /**
     * @return the valoracionAdicionar
     */
    public boolean isValoracionAdicionar() {
        return valoracionAdicionar;
    }

    /**
     * @param valoracionAdicionar the valoracionAdicionar to set
     */
    public void setValoracionAdicionar(boolean valoracionAdicionar) {
        this.valoracionAdicionar = valoracionAdicionar;
    }

    /**
     * @return the valoracionModificar
     */
    public boolean isValoracionModificar() {
        return valoracionModificar;
    }

    /**
     * @param valoracionModificar the valoracionModificar to set
     */
    public void setValoracionModificar(boolean valoracionModificar) {
        this.valoracionModificar = valoracionModificar;
    }

    /**
     * @return the mejoramientoAdicionar
     */
    public boolean isMejoramientoAdicionar() {
        return mejoramientoAdicionar;
    }

    /**
     * @param mejoramientoAdicionar the mejoramientoAdicionar to set
     */
    public void setMejoramientoAdicionar(boolean mejoramientoAdicionar) {
        this.mejoramientoAdicionar = mejoramientoAdicionar;
    }

    /**
     * @return the mejoramientoModificar
     */
    public boolean isMejoramientoModificar() {
        return mejoramientoModificar;
    }

    /**
     * @param mejoramientoModificar the mejoramientoModificar to set
     */
    public void setMejoramientoModificar(boolean mejoramientoModificar) {
        this.mejoramientoModificar = mejoramientoModificar;
    }
}
