/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.ClaseBean;
import com.srp.dao.ClaseImpDAO;
import com.srp.persistencia.Clase;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class ClaseImpBO {
    
    private ClaseImpDAO claseDAO;
    
    public boolean agregar(ClaseBean obj){
        Clase clase = new Clase();
        getClaseDAO().agregar(clase);
        return true;
    }
    
    public boolean actualizar (Clase obj, String desc){
        obj.setDescclase(desc);
        getClaseDAO().actualizar(obj);
        return true;
    }
    
    public List listados(){
        return getClaseDAO().listado();
    }
    
    /**
     * @return the claseDAO
     */
    public ClaseImpDAO getClaseDAO() {
        return claseDAO;
    }

    /**
     * @param claseDAO the claseDAO to set
     */
    public void setClaseDAO(ClaseImpDAO claseDAO) {
        this.claseDAO = claseDAO;
    }
    
    
}
