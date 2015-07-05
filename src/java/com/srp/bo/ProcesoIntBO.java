/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.ProcesoBean;
import com.srp.persistencia.Proceso;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public interface ProcesoIntBO {
    
    public boolean agregar(ProcesoBean obj);
    public boolean actualizar(Proceso obj, int funcionario, int estado);
    public boolean eleminar(ProcesoBean obj);
    public List<Proceso> listado();
}
