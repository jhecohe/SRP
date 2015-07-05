/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.LoginBean;
import com.srp.dao.LoginImpDAO;
import com.srp.persistencia.Usuario;

/**
 *
 * @author jhecohe
 */
public class LoginImpBO implements LoginIntBO {
    
    private LoginImpDAO loginDAO;

    @Override
    public void validaLogin(LoginBean obj) {
        System.out.println("Entramos en LoginImpBO");
        Usuario usuario = new Usuario();
        usuario.setNombreusuario(obj.getUsuario());
        usuario.setClave(obj.getClave());
        usuario = getLoginDAO().validaLogin(usuario);
        System.out.println("Despues de validar el loginimpDAO");
        if (usuario != null) {
            obj.setEstado(true);
            obj.setMensaje("Usaurio Encontrado");
        } else {
            obj.setEstado(false);
            obj.setMensaje("Usaurio no Encontrado");
        }
    }

    public LoginImpDAO getLoginDAO() {
        return loginDAO;
    }

    public void setLoginDAO(LoginImpDAO loginDAO) {
        this.loginDAO = loginDAO;
    }
    
}
