/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.beans;

import com.srp.bo.GradoImpBO;
import com.srp.persistencia.Grado;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class GradoBean {
    
     private int idgrado;
     private String descgrado;
     private GradoImpBO gradoBO;
     
     public void agregar(){
         getGradoBO().agregar(this);
     }
     
     public void actualizar(RowEditEvent event){
         Grado grado = (Grado) event.getObject();
         getGradoBO().actualizar(grado, descgrado);
     }
     
     public List listado(){
         return getGradoBO().listado();
     }

    /**
     * @return the idgrado
     */
    public int getIdgrado() {
        return idgrado;
    }

    /**
     * @param idgrado the idgrado to set
     */
    public void setIdgrado(int idgrado) {
        this.idgrado = idgrado;
    }

    /**
     * @return the descgrado
     */
    public String getDescgrado() {
        return descgrado;
    }

    /**
     * @param descgrado the descgrado to set
     */
    public void setDescgrado(String descgrado) {
        this.descgrado = descgrado;
    }

    /**
     * @return the gradoBO
     */
    public GradoImpBO getGradoBO() {
        return gradoBO;
    }

    /**
     * @param gradoBO the gradoBO to set
     */
    public void setGradoBO(GradoImpBO gradoBO) {
        this.gradoBO = gradoBO;
    }
}
