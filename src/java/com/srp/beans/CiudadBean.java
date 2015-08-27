/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.CiudadImpBO;
import com.srp.persistencia.Ciudad;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class CiudadBean {

    private int idciudad;
    private int departamento;
    private String codigociudad;
    private String descciudad;
    private CiudadImpBO ciudadBO;
    
    public void agregar(){
        getCiudadBO().agragar(this);
    }
    
    public void actualizar(RowEditEvent event){
        Ciudad ciudad = (Ciudad)event.getObject();
        getCiudadBO().actualizar(ciudad, descciudad);
    }
    
    public List listado(){
        return getCiudadBO().listado();
    }

    public List departamentoListado(){
        return ciudadBO.departamentoListado();
    }
    /**
     * @return the idciudad
     */
    public int getIdciudad() {
        return idciudad;
    }

    /**
     * @param idciudad the idciudad to set
     */
    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    /**
     * @return the departamento
     */
    public int getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the codigociudad
     */
    public String getCodigociudad() {
        return codigociudad;
    }

    /**
     * @param codigociudad the codigociudad to set
     */
    public void setCodigociudad(String codigociudad) {
        this.codigociudad = codigociudad;
    }

    /**
     * @return the descciudad
     */
    public String getDescciudad() {
        return descciudad;
    }

    /**
     * @param descciudad the descciudad to set
     */
    public void setDescciudad(String descciudad) {
        this.descciudad = descciudad;
    }

    /**
     * @return the ciudadBO
     */
    public CiudadImpBO getCiudadBO() {
        return ciudadBO;
    }

    /**
     * @param ciudadBO the ciudadBO to set
     */
    public void setCiudadBO(CiudadImpBO ciudadBO) {
        this.ciudadBO = ciudadBO;
    }
}
