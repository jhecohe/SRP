/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Planmejoramiento;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public interface MejoramientoIntDAO {
    public boolean agregar(Planmejoramiento obj);
    public boolean actualizar(Planmejoramiento obj);
    public List<Planmejoramiento> listado();
}
