/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.AreaBean;
import com.srp.dao.AreaImpDAO;
import com.srp.persistencia.Area;
import com.srp.persistencia.Seccional;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class AreaImpBO {
    
    private AreaImpDAO areaDAO;
    
    public boolean agragar(AreaBean obj){
        Area area = new Area();
        Seccional seccional = new Seccional();
        seccional.setIdseccional(obj.getSeccional());
        area.setCodigoarea(obj.getCodigoarea());
        area.setDescarea(obj.getDescarea());
        area.setSeccional(seccional);
        getAreaDAO().agregar(area);
        return true;
    }
    
    public boolean actualizar(Area obj, String desc){
        obj.setDescarea(desc);
        getAreaDAO().actualizar(obj);
        return true;
    }
    
    public boolean eliminar(Area obj){
        getAreaDAO().eliminar(obj);
        return true;
    }
    
    public List<Area> listado(){
        return getAreaDAO().listado();
    }

    public List<Area> listadoPorSeccional(int idseccional){
        return getAreaDAO().listadoPorRegional(idseccional);
    }
    
    /**
     * @return the areaDAO
     */
    public AreaImpDAO getAreaDAO() {
        return areaDAO;
    }

    /**
     * @param areaDAO the areaDAO to set
     */
    public void setAreaDAO(AreaImpDAO areaDAO) {
        this.areaDAO = areaDAO;
    }
    
}
