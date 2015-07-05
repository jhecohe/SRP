/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.TipoprocesoImpBO;
import com.srp.persistencia.Tipoproceso;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class TipoprocesoBean {

    private int idtipoproceso;
    private String desctipo;
    private TipoprocesoImpBO tipoprocesoBO;
    
    public void agregar(){
        getTipoprocesoBO().agregar(this);
    }
    
    public void actualizar(RowEditEvent event){
        Tipoproceso tipoproceso =(Tipoproceso) event.getObject();
        getTipoprocesoBO().actualizar(tipoproceso, desctipo);
    }
    
    public List listado(){
        return getTipoprocesoBO().listado();
    }

    /**
     * @return the idtipoproceso
     */
    public int getIdtipoproceso() {
        return idtipoproceso;
    }

    /**
     * @param idtipoproceso the idtipoproceso to set
     */
    public void setIdtipoproceso(int idtipoproceso) {
        this.idtipoproceso = idtipoproceso;
    }

    /**
     * @return the desctipo
     */
    public String getDesctipo() {
        return desctipo;
    }

    /**
     * @param desctipo the desctipo to set
     */
    public void setDesctipo(String desctipo) {
        this.desctipo = desctipo;
    }

    /**
     * @return the tipoprocesoBO
     */
    public TipoprocesoImpBO getTipoprocesoBO() {
        return tipoprocesoBO;
    }

    /**
     * @param tipoprocesoBO the tipoprocesoBO to set
     */
    public void setTipoprocesoBO(TipoprocesoImpBO tipoprocesoBO) {
        this.tipoprocesoBO = tipoprocesoBO;
    }
}
