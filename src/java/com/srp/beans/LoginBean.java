/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.LoginImpBO;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author jacs
 */
public class LoginBean implements Serializable {

    private String usuario;
    private String clave;
    private String perfil;
    private int idperfil;
    private String mensaje;
    private boolean estado;
    private List<LoginBean> listaUsuarios;
    private LoginImpBO loginBO;
    public final static String USER_KEY = "auth_user";

    public String validarLogin(ActionEvent e) throws IOException {
        getLoginBO().validaLogin(this);
        String pagina = ""; 

        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext extContext = context.getExternalContext();
        if (this.getEstado()) {
            switch (this.getPerfil()) {

                case "administrador":
                    System.out.println("Case adminitrador");
                    pagina = extContext.encodeActionURL(
                            context.getApplication().getViewHandler().getActionURL(context, "/Admin/menuAdmin.jspx"));
                    extContext.getSessionMap().put(USER_KEY, new UsuarioBean(this.usuario, this.perfil));
                    RiesgoBean.visual = true;
                    extContext.redirect(pagina);
                    break;

                case "operador":
                    VisualOperador operador = new VisualOperador();
                    pagina = extContext.encodeActionURL(
                            context.getApplication().getViewHandler().getActionURL(context, "/operador/menuAdmin.jspx"));
                    extContext.getSessionMap().put(USER_KEY, new UsuarioBean(this.usuario, this.perfil));
//                    RiesgoBean.visual = operador.isVisualriesgo();
                    RiesgoBean.visual = false;
                    extContext.redirect(pagina);
                    break;
//
//                case "dueño de proceso":
//                    getUsuarioBO().setPerfil(perfil);
//                    getUsuarioBO().setUsuario(usuario);
//                    pagina = extContext.encodeActionURL(
//                            context.getApplication().getViewHandler().getActionURL(context, "/admin/menuAdmin.jspx"));
//                    extContext.getSessionMap().put(USER_KEY, getUsuarioBO());
//                    extContext.redirect(pagina);
//                    break;
//
//                case "ejecutor de proceso":
//                    getUsuarioBO().setPerfil(perfil);
//                    getUsuarioBO().setUsuario(usuario);
//                    pagina = extContext.encodeActionURL(
//                            context.getApplication().getViewHandler().getActionURL(context, "/admin/menuAdmin.jspx"));
//                    extContext.getSessionMap().put(USER_KEY, getUsuarioBO());
//                    extContext.redirect(pagina);
//                    break;
//
//                case "gestor de riesgo":
//                    getUsuarioBO().setPerfil(perfil);
//                    getUsuarioBO().setUsuario(usuario);
//                    pagina = extContext.encodeActionURL(
//                            context.getApplication().getViewHandler().getActionURL(context, "/admin/menuAdmin.jspx"));
//                    extContext.getSessionMap().put(USER_KEY, getUsuarioBO());
//                    extContext.redirect(pagina);
//                    break;
//
//                case "auditor":
//                    getUsuarioBO().setPerfil(perfil);
//                    getUsuarioBO().setUsuario(usuario);
//                    pagina = extContext.encodeActionURL(
//                            context.getApplication().getViewHandler().getActionURL(context, "/admin/menuAdmin.jspx"));
//                    extContext.getSessionMap().put(USER_KEY, getUsuarioBO());
//                    extContext.redirect(pagina);
//                    break;
            }
            return pagina;
        } else {
            return "index";
        }
    }
    
    
    public void cerrarCesion() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext extContext = context.getExternalContext();
        extContext.getSessionMap().remove(USER_KEY);
        String url = extContext.encodeActionURL(
                context.getApplication().getViewHandler().getActionURL(context, "/index.jspx"));
        extContext.redirect(url);
    }

//    public void setLista() {
//        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
//        Map<String, Object> sessionMap = externalContext.getSessionMap();
//        setListaUsuarios((List<LoginBean>) sessionMap.get("listaUsuarios"));
//    }

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
}
