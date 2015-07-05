/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Proceso;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public interface ProcesoIntDAO {
    
    public boolean agregar(Proceso obj);
    public boolean actualizar(Proceso obj);
    public boolean eleminar(Proceso obj);
    public List<Proceso> listado();
}
