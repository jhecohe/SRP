/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.ValoracionBean;
import com.srp.persistencia.Analisisvaloracion;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public interface ValoracionIntBO {
    
    public boolean agregar(ValoracionBean obj);
    public boolean actualizar(Analisisvaloracion obj);
    public List<Analisisvaloracion> listado();
}
