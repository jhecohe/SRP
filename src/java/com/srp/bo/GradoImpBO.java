/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.GradoBean;
import com.srp.dao.GradoImpDAO;
import com.srp.persistencia.Grado;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class GradoImpBO {
    
    private GradoImpDAO gradoDAO;
    
    public boolean agregar(GradoBean obj){
        Grado grado = new Grado();
        grado.setDescgrado(obj.getDescgrado());
        getGradoDAO().agregar(grado);
        return true;
    }
    
    public boolean actualizar(Grado obj, String desc){
        obj.setDescgrado(desc);
        getGradoDAO().actualizar(obj);
        return true;
    }
    
    public List<Grado> listado(){
        return getGradoDAO().listado();
    }

    /**
     * @return the gradoDAO
     */
    public GradoImpDAO getGradoDAO() {
        return gradoDAO;
    }

    /**
     * @param gradoDAO the gradoDAO to set
     */
    public void setGradoDAO(GradoImpDAO gradoDAO) {
        this.gradoDAO = gradoDAO;
    }
}
