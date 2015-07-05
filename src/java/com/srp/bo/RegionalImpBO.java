/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.RegionalBean;
import com.srp.dao.RegionalImpDAO;
import com.srp.persistencia.Regional;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class RegionalImpBO {
    
    private RegionalImpDAO regionalDAO;
    
    public boolean agregar(RegionalBean obj){
        Regional regional = new Regional();
        regional.setCodigoregional(obj.getCodigoregional());
        regional.setDescregional(obj.getDescregional());
        getRegionalDAO().agregar(regional);
        return true;
    }
    
    public boolean actualizar(Regional obj, String desc){
        getRegionalDAO().actualizar(obj);
        return true;
    }
    
    public boolean eleminar(Regional obj){
        getRegionalDAO().eliminar(obj);
        return true;
    }
    
    public List<Regional> listado(){
        return getRegionalDAO().listado();
    }

    /**
     * @return the regionalDAO
     */
    public RegionalImpDAO getRegionalDAO() {
        return regionalDAO;
    }

    /**
     * @param regionalDAO the regionalDAO to set
     */
    public void setRegionalDAO(RegionalImpDAO regionalDAO) {
        this.regionalDAO = regionalDAO;
    }
}
