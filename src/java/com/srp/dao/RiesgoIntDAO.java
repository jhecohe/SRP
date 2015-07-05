/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Riesgo;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public interface RiesgoIntDAO {
    
    boolean agregar(Riesgo obj);
    boolean actualizar(Riesgo obj);
    List<Riesgo> listado();
}
