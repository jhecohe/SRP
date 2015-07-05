/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.beans;

import com.srp.bo.TiporiesgoImpBO;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class TiporiesgoBean {
    
    private int idtipo;
    private String desctiporiesgo;
    private TiporiesgoImpBO tiporiesgoBO;

    public void agregar(){
        getTiporiesgoBO().agregar(this);
    }
    
    public void actualizar(){
        getTiporiesgoBO().actualizar(this);
    }
    
    public void eliminar(){
        getTiporiesgoBO().eliminar(this);
    }
    
    public List listado(){
        List tiporiesgos = getTiporiesgoBO().listado();
        return tiporiesgos;
    }
    
    /**
     * @return the idtipo
     */
    public int getIdtipo() {
        return idtipo;
    }

    /**
     * @param idtipo the idtipo to set
     */
    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    /**
     * @return the desctiporiesgo
     */
    public String getDesctiporiesgo() {
        return desctiporiesgo;
    }

    /**
     * @param desctiporiesgo the desctiporiesgo to set
     */
    public void setDesctiporiesgo(String desctiporiesgo) {
        this.desctiporiesgo = desctiporiesgo;
    }

    /**
     * @return the tiporiesgoBO
     */
    public TiporiesgoImpBO getTiporiesgoBO() {
        return tiporiesgoBO;
    }

    /**
     * @param tiporiesgoBO the tiporiesgoBO to set
     */
    public void setTiporiesgoBO(TiporiesgoImpBO tiporiesgoBO) {
        this.tiporiesgoBO = tiporiesgoBO;
    }
}
