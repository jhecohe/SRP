/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Panorama;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public interface PanoramaIntDAO {
    
    public boolean agregar(Panorama obj);
    public boolean actualizar(Panorama obj);
    public List<Panorama> listado();
    
}
