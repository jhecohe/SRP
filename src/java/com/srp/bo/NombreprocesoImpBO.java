/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.NombreprocesoBean;
import com.srp.dao.NombreprocesoImpDAO;
import com.srp.persistencia.Nombreproceso;
import com.srp.persistencia.Tipoproceso;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class NombreprocesoImpBO {
    
    private NombreprocesoImpDAO nombreprocesoDAO;
    
    public boolean agregar(NombreprocesoBean obj){
        Nombreproceso nombreproceso = new Nombreproceso();
        Tipoproceso tipoproceso = new Tipoproceso();
        tipoproceso.setIdtipoproceso(obj.getTipoproceso());
        nombreproceso.setTipoproceso(tipoproceso);
        nombreproceso.setDescnombre(obj.getDescnombre());
        getNombreprocesoDAO().agregar(nombreproceso);
        return true;
    }
    
    public boolean actualizar(Nombreproceso obj, String descnombre){
        obj.setDescnombre(descnombre);
        getNombreprocesoDAO().actualizar(obj);
        return true;
    }
    
    public boolean eliminar(Nombreproceso obj){
        getNombreprocesoDAO().eliminar(obj);
        return true;
    }
    
    public List<Nombreproceso> listado(){
        return getNombreprocesoDAO().listado();
    }
    
    public List<Nombreproceso> listadoPorTipo(int idtipo){
        return getNombreprocesoDAO().listadoPorTipo(idtipo);
    }

    /**
     * @return the nombreprocesoDAO
     */
    public NombreprocesoImpDAO getNombreprocesoDAO() {
        return nombreprocesoDAO;
    }

    /**
     * @param nombreprocesoDAO the nombreprocesoDAO to set
     */
    public void setNombreprocesoDAO(NombreprocesoImpDAO nombrerocesoDAO) {
        this.nombreprocesoDAO = nombrerocesoDAO;
    }
}
