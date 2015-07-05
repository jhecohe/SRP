/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.SubareaBean;
import com.srp.dao.SubareaImpDAO;
import com.srp.persistencia.Subarea;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class SubareaImpBO {
    
    private SubareaImpDAO subareaDAO;
    
    public boolean agregar(SubareaBean obj){
        return true;
    }
    
    public boolean actualizar(Subarea obj, String desc){
        getSubareaDAO().actualizar(obj, desc);
        return true;
    }
    
    public boolean eleminar(Subarea obj){
        getSubareaDAO().eleminar(obj);
        return true;
    }
    
    public List<Subarea> listado(){
        return getSubareaDAO().listado();
    }
    
    public List<Subarea> listadoPorArea(int idarea){
        return getSubareaDAO().listadoPorArea(idarea);
    }

    /**
     * @return the subareaDAO
     */
    public SubareaImpDAO getSubareaDAO() {
        return subareaDAO;
    }

    /**
     * @param subareaDAO the subareaDAO to set
     */
    public void setSubareaDAO(SubareaImpDAO subareaDAO) {
        this.subareaDAO = subareaDAO;
    }
}
