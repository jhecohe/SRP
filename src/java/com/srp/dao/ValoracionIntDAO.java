/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Analisisvaloracion;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public interface ValoracionIntDAO {
    
    public boolean agregar(Analisisvaloracion obj);
    public boolean actualizar(Analisisvaloracion obj);
    public List listado();    
}
