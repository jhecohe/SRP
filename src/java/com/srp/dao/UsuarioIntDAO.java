/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Usuario;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public interface UsuarioIntDAO {
    
    public boolean agregar (Usuario obj);
    public boolean actualizar (Usuario obj, int perfil);
    public List<Usuario> listado();
}
