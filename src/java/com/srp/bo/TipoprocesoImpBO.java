/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.TipoprocesoBean;
import com.srp.dao.TipoprocesoImpDAO;
import com.srp.persistencia.Tipoproceso;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class TipoprocesoImpBO {
    
    private TipoprocesoImpDAO tipoprocesoDAO;
    
    public boolean agregar (TipoprocesoBean obj){
        Tipoproceso tipoproceso = new Tipoproceso();
        tipoproceso.setDesctipo(obj.getDesctipo());
        getTipoprocesoDAO().agregar(tipoproceso);
        return true;
    }
    
    public boolean actualizar(Tipoproceso obj, String desctipo){
        obj.setDesctipo(desctipo);
        getTipoprocesoDAO().actualizar(obj);
        return true;
    }
    
    public List<Tipoproceso> listado (){
        System.out.println("tipoprocesoBO listado tipoproceso");
        return getTipoprocesoDAO().listado();
    }

    /**
     * @return the tipoprocesoDAO
     */
    public TipoprocesoImpDAO getTipoprocesoDAO() {
        return tipoprocesoDAO;
    }

    /**
     * @param tipoprocesoDAO the tipoprocesoDAO to set
     */
    public void setTipoprocesoDAO(TipoprocesoImpDAO tipoprocesoDAO) {
        this.tipoprocesoDAO = tipoprocesoDAO;
    }
}
