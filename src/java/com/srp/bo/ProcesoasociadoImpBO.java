/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.ProcesoasociadoBean;
import com.srp.dao.ProcesoasociadoImpDAO;
import com.srp.persistencia.Procesoasociado;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class ProcesoasociadoImpBO {
    
    private ProcesoasociadoImpDAO procesoasociadoDAO;
    
    public boolean agregar(ProcesoasociadoBean obj){
        return true;
    }
    
    public boolean actualizar(Procesoasociado obj, String desc){
        return true;
    }
    
    public boolean eliminar(Procesoasociado obj){
        return true;
    }
    
    public List<Procesoasociado> listado(){
        return getProcesoasociadoDAO().listado();
    }
    
    public List<Procesoasociado> listadoPorNombre(int idnombre){
        System.out.println("ProcesoasociadoImpBO Listado de procesos asociados");
        return getProcesoasociadoDAO().listadoPorNombre(idnombre);
    }

    /**
     * @return the procesoasociadoDAO
     */
    public ProcesoasociadoImpDAO getProcesoasociadoDAO() {
        return procesoasociadoDAO;
    }

    /**
     * @param procesoasociadoDAO the procesoasociadoDAO to set
     */
    public void setProcesoasociadoDAO(ProcesoasociadoImpDAO procesoasociadoDAO) {
        this.procesoasociadoDAO = procesoasociadoDAO;
    }
}
