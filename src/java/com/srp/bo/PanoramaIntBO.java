/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.PanoramaBean;
import com.srp.persistencia.Panorama;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public interface PanoramaIntBO {
    
    public boolean agregar(PanoramaBean obj);
    public boolean actualizar(Panorama obj);
    public List listado();
}
