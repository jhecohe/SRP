/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.DepartamentoImpBO;
import com.srp.persistencia.Departamento;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class DepartamentoBean {

    private int iddepartamento;
    private String codigodepartamento;
    private String descdepartamento;
    private DepartamentoImpBO departamentoBO;

    public void agregar(){
        getDepartamentoBO().agregar(this);
    }
    
    public void actualizar(RowEditEvent event){
        Departamento departamento = (Departamento)event.getObject();
        getDepartamentoBO().actualizar(departamento, descdepartamento);
    }
    
    public List<Departamento> listado(){
        return getDepartamentoBO().listado();
    }
    /**
     * @return the iddepartamento
     */
    public int getIddepartamento() {
        return iddepartamento;
    }

    /**
     * @param iddepartamento the iddepartamento to set
     */
    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    /**
     * @return the codigodepartamento
     */
    public String getCodigodepartamento() {
        return codigodepartamento;
    }

    /**
     * @param codigodepartamento the codigodepartamento to set
     */
    public void setCodigodepartamento(String codigodepartamento) {
        this.codigodepartamento = codigodepartamento;
    }

    /**
     * @return the descdepartamento
     */
    public String getDescdepartamento() {
        return descdepartamento;
    }

    /**
     * @param descdepartamento the descdepartamento to set
     */
    public void setDescdepartamento(String descdepartamento) {
        this.descdepartamento = descdepartamento;
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
