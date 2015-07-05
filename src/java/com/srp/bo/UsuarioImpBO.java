/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.UsuarioBean;
import com.srp.dao.UsuarioImpDAO;
import com.srp.persistencia.Funcionario;
import com.srp.persistencia.Perfil;
import com.srp.persistencia.Usuario;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class UsuarioImpBO implements UsuarioIntBO {
    
    private UsuarioImpDAO usuarioDAO;
    private FuncionarioImpBO funcionarioBO;
    private PerfilImpBO perfilBO;

    @Override
    public boolean agregar(UsuarioBean obj) {
        Usuario usuario = new Usuario();
        Funcionario funcionario = new Funcionario();
        funcionario.setIdfuncionario(obj.getFuncionario());
        Perfil perfil = new Perfil();
        perfil.setIdperfil(obj.getPerfil());
        
        usuario.setClave(obj.getClave());
        usuario.setFuncionario(funcionario);
        usuario.setNombreusuario(obj.getNombreusuario());
        usuario.setPerfil(perfil);
        
        getUsuarioDAO().agregar(usuario);
        return true;
    }

    @Override
    public boolean actualizar(Usuario obj, int perfil) {
        getUsuarioDAO().actualizar(obj, perfil);
        return true;
    }

    @Override
    public List<Usuario> listado() {
        return getUsuarioDAO().listado();
    }

    @Override
    public boolean eliminar(Usuario obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Funcionario> funcionarioListado() {
        return getFuncionarioBO().listado();
    }
    
    public List perfilListado() {
        return getPerfilBO().listado();
    }

    /**
     * @return the usuarioDAO
     */
    public UsuarioImpDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    /**
     * @param usuarioDAO the usuarioDAO to set
     */
    public void setUsuarioDAO(UsuarioImpDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }    

    /**
     * @return the funcionarioBO
     */
    public FuncionarioImpBO getFuncionarioBO() {
        return funcionarioBO;
    }

    /**
     * @param funcionarioBO the funcionarioBO to set
     */
    public void setFuncionarioBO(FuncionarioImpBO funcionarioBO) {
        this.funcionarioBO = funcionarioBO;
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
}
