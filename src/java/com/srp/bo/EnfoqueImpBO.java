/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.EnfoqueBean;
import com.srp.dao.EnfoqueImpDAO;
import com.srp.persistencia.Enfoque;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class EnfoqueImpBO {
    
    private EnfoqueImpDAO enfoqueDAO;
    
    public boolean agregar(EnfoqueBean obj){
        Enfoque enfoque = new Enfoque();
        enfoque.setIdenfoque(obj.getIdenfoque());
        enfoque.setDescenfoque(obj.getDescenfoque());
        getEnfoqueDAO().agregar(enfoque);
        return true;
    }
    
    public boolean actualizar(EnfoqueBean obj){
        Enfoque enfoque = new Enfoque();
        enfoque.setIdenfoque(obj.getIdenfoque());
        enfoque.setDescenfoque(obj.getDescenfoque());
        getEnfoqueDAO().actualizar(enfoque);
        return true;
    }
    
    public boolean eliminar(EnfoqueBean obj){
        Enfoque enfoque = new Enfoque();
        enfoque.setIdenfoque(obj.getIdenfoque());
        enfoque.setDescenfoque(obj.getDescenfoque());
        getEnfoqueDAO().eliminar(enfoque);
        return true;
    }
    
    public List listado(){
        List enfoque = getEnfoqueDAO().listado();
        return enfoque;
    }

    /**
     * @return the enfoqueDAO
     */
    public EnfoqueImpDAO getEnfoqueDAO() {
        return enfoqueDAO;
    }

    /**
     * @param enfoqueDAO the enfoqueDAO to set
     */
    public void setEnfoqueDAO(EnfoqueImpDAO enfoqueDAO) {
        this.enfoqueDAO = enfoqueDAO;
    }
}
