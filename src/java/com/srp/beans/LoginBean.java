/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.LoginImpBO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author jacs
 */
public class LoginBean implements Serializable {

    private String usuario;
    private String clave;
    private String perfil;
    private String mensaje;
    private boolean estado;
    private List<LoginBean> listaUsuarios;
    private LoginImpBO loginBO;
    
    public String validarLogin (){
         System.out.println("Entro al login Bean");
         getLoginBO().validaLogin(this);
        if (this.getEstado()) {
            ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
            Map<String, Object> sessionMap = externalContext.getSessionMap();
            setListaUsuarios(new ArrayList<LoginBean>());
            sessionMap.put("listaUsuarios", getListaUsuarios());
            return "Admin/menuAdmin";
        }else{
            return "index";
        }
    }

    public void setLista(){
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        Map<String, Object> sessionMap = externalContext.getSessionMap();
        setListaUsuarios((List<LoginBean>)sessionMap.get("listaUsuarios"));
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<LoginBean> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<LoginBean> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public LoginImpBO getLoginBO() {
        return loginBO;
    }

    public void setLoginBO(LoginImpBO loginBO) {
        this.loginBO = loginBO;
    }
    
}
