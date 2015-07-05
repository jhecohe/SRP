/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.UsuarioBean;
import com.srp.persistencia.Usuario;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public interface UsuarioIntBO {
    
    public boolean agregar(UsuarioBean obj);
    public boolean actualizar(Usuario obj, int perfil);
    public List<Usuario> listado();
    public boolean eliminar(Usuario obj);
    
}
