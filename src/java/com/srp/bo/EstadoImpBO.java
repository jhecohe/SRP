/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.EstadoBean;
import com.srp.dao.EstadoImpDAO;
import com.srp.persistencia.Estado;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class EstadoImpBO {
    
    private EstadoImpDAO estadoDAO;
    
    public boolean agregar(EstadoBean obj){
        Estado estado = new Estado();
        estado.setDescestado(obj.getDescestado());
        getEstadoDAO().agregar(estado);
        return true;
    }
    
    public boolean actualizar(EstadoBean obj){
        Estado estado = new Estado();
        estado.setIdestado(obj.getIdestado());
        estado.setDescestado(obj.getDescestado());
        getEstadoDAO().actualizar(estado);
        return true;
    }
    
    public boolean eliminar(EstadoBean obj){
        Estado estado = new Estado();
        estado.setIdestado(obj.getIdestado());
        estado.setDescestado(obj.getDescestado());
        getEstadoDAO().eliminar(estado);
        return true;
    }
    
    public List<Estado> listado(){
        List<Estado> estados = getEstadoDAO().listado();
        return estados;
    }

    /**
     * @return the estadoDAO
     */
    public EstadoImpDAO getEstadoDAO() {
        return estadoDAO;
    }

    /**
     * @param estadoDAO the estadoDAO to set
     */
    public void setEstadoDAO(EstadoImpDAO estadoDAO) {
        this.estadoDAO = estadoDAO;
    }
}
