/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.DepartamentoBean;
import com.srp.dao.DepartamentoImpDAO;
import com.srp.persistencia.Departamento;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class DepartamentoImpBO {
    
    private DepartamentoImpDAO departamentoDAO;
    
    public boolean agregar(DepartamentoBean obj){
        Departamento departamento = new Departamento();
        departamento.setCodigodepartamento(obj.getCodigodepartamento());
        departamento.setDescdepartamento(obj.getDescdepartamento());
        getDepartamentoDAO().agregar(departamento);
        return true;
    }
    
    public boolean actualizar(Departamento obj, String desc){
        getDepartamentoDAO().actualizar(obj, desc);
        return true;
    }
    
    public List<Departamento> listado(){
        return getDepartamentoDAO().listado();
    }

    /**
     * @return the departamentoDAO
     */
    public DepartamentoImpDAO getDepartamentoDAO() {
        return departamentoDAO;
    }

    /**
     * @param departamentoDAO the departamentoDAO to set
     */
    public void setDepartamentoDAO(DepartamentoImpDAO departamentoDAO) {
        this.departamentoDAO = departamentoDAO;
    }
}
