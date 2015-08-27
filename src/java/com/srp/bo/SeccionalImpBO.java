/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.SeccionalBean;
import com.srp.dao.SeccionalImpDAO;
import com.srp.persistencia.Regional;
import com.srp.persistencia.Seccional;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class SeccionalImpBO {
    
    private SeccionalImpDAO seccionalDAO;
    private RegionalImpBO regionalBO;
    
    public boolean agregar(SeccionalBean obj){
        Seccional objeto = new Seccional();
        Regional regional = new Regional();
        regional.setIdregional(obj.getRegional());
        objeto.setRegional(regional);
        objeto.setCodigoseccional(obj.getCodigoseccional());
        objeto.setDescseccional(obj.getDescseccional());
        return true;
    }
    
    public boolean actualizar(Seccional obj, String desc){
        getSeccionalDAO().actualizar(obj, desc);
        return true;
    }
    
    public boolean eliminar(Seccional obj){
        getSeccionalDAO().eliminar(obj);
        return true;
    }
    
    public List<Seccional> listado(){
        return getSeccionalDAO().listado();
    }
    
    public List<Seccional> listadoPorRegional(int idregional){
        return getSeccionalDAO().listadoPorRegional(idregional);
    }

    public List regionalListado(){
        return getRegionalBO().listado();
    }
    /**
     * @return the seccionalDAO
     */
    public SeccionalImpDAO getSeccionalDAO() {
        return seccionalDAO;
    }

    /**
     * @param seccionalDAO the seccionalDAO to set
     */
    public void setSeccionalDAO(SeccionalImpDAO seccionalDAO) {
        this.seccionalDAO = seccionalDAO;
    }

    /**
     * @return the regionalBO
     */
    public RegionalImpBO getRegionalBO() {
        return regionalBO;
    }

    /**
     * @param regionalBO the regionalBO to set
     */
    public void setRegionalBO(RegionalImpBO regionalBO) {
        this.regionalBO = regionalBO;
    }
}
