/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.RiesgoBean;
import com.srp.persistencia.Riesgo;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public interface RiesgoIntBO {
    
    boolean agregar(RiesgoBean obj);
    boolean actualizar(Riesgo obj, int idestado);
    List<Riesgo> listado();
}
