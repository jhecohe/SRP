/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.UsuarioImpBO;
import com.srp.persistencia.Usuario;
import java.io.Serializable;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class UsuarioBean implements Serializable {

    private int idusuario;
    private int idperfil;
    private String perfil;
    private int funcionario;
    private String nombreusuario;
    private String clave;
    private String reclave;
    
    private UsuarioImpBO usuarioBO;
    
    public UsuarioBean(){    
    }
    
    public UsuarioBean(String nombreusuario, String perfil){
        this.nombreusuario = nombreusuario;
        this.perfil = perfil;
    }
    
    public void agregar(){
        usuarioBO.agregar(this);
    }
    
    public void actualizar(RowEditEvent obj){
        System.out.println("Estamos en actualizar usuario");
        Usuario usuario;
        usuario = (Usuario)obj.getObject();
        getUsuarioBO().actualizar(usuario, getIdperfil());
    }
    
    public List listado(){
        return getUsuarioBO().listado();
    }
    
    public List funcionarioListado(){
        return getUsuarioBO().funcionarioListado();
    }
    
    public List perfilListado(){
        return getUsuarioBO().perfilListado();
    }

    /**
     * @return the idusuario
     */
    public int getIdusuario() {
        return idusuario;
    }

    /**
     * @param idusuario the idusuario to set
     */
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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
     * @return the nombreusuario
     */
    public String getNombreusuario() {
        return nombreusuario;
    }

    /**
     * @param nombreusuario the nombreusuario to set
     */
    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the usuarioBO
     */
    public UsuarioImpBO getUsuarioBO() {
        return usuarioBO;
    }

    /**
     * @param usuarioBO the usuarioBO to set
     */
    public void setUsuarioBO(UsuarioImpBO usuarioBO) {
        this.usuarioBO = usuarioBO;
    }

    /**
     * @return the reclave
     */
    public String getReclave() {
        return reclave;
    }

    /**
     * @param reclave the reclave to set
     */
    public void setReclave(String reclave) {
        this.reclave = reclave;
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
     * @return the perfil
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

}
