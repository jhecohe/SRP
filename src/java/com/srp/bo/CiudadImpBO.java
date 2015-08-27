/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.CiudadBean;
import com.srp.dao.CiudadImpDAO;
import com.srp.persistencia.Ciudad;
import com.srp.persistencia.Departamento;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class CiudadImpBO {
    
    private CiudadImpDAO ciudadDAO;
    private DepartamentoImpBO departamentoBO;
    
    public boolean agragar(CiudadBean obj){
        Ciudad ciudad = new Ciudad();
        Departamento departamento = new Departamento();
        departamento.setIddepartamento(obj.getDepartamento());
        ciudad.setCodigociudad(obj.getCodigociudad());        
        ciudad.setDepartamento(departamento);
        ciudad.setDescciudad(obj.getDescciudad());
        getCiudadDAO().agregar(ciudad);
        return true;
    }
    
    public boolean actualizar(Ciudad obj, String desc){
        obj.setDescciudad(desc);
        getCiudadDAO().actualizar(obj, desc);
        return true;
    }
    
    public List<Ciudad> listado(){
        return getCiudadDAO().listado();
    }
    
    public List<Departamento> departamentoListado(){
        return departamentoBO.listado();
    }

    /**
     * @return the ciudadDAO
     */
    public CiudadImpDAO getCiudadDAO() {
        return ciudadDAO;
    }

    /**
     * @param ciudadDAO the ciudadDAO to set
     */
    public void setCiudadDAO(CiudadImpDAO ciudadDAO) {
        this.ciudadDAO = ciudadDAO;
    }

    /**
     * @return the departamentoBO
     */
    public DepartamentoImpBO getDepartamentoBO() {
        return departamentoBO;
    }

    /**
     * @param departamentoBO the departamentoBO to set
     */
    public void setDepartamentoBO(DepartamentoImpBO departamentoBO) {
        this.departamentoBO = departamentoBO;
    }
}
