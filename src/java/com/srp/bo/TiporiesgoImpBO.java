/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.bo;

import com.srp.beans.TiporiesgoBean;
import com.srp.dao.TiporiesgoImpDAO;
import com.srp.persistencia.Tiporiesgo;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class TiporiesgoImpBO {

    private TiporiesgoImpDAO tiporiesgoDAO;

    public boolean agregar(TiporiesgoBean obj) {
        Tiporiesgo tiporiesgo = new Tiporiesgo();
        tiporiesgo.setIdtipo(obj.getIdtipo());
        tiporiesgo.setDesctiporiesgo(obj.getDesctiporiesgo());
        getTiporiesgoDAO().agregar(tiporiesgo);
        return true;
    }

    public boolean actualizar(TiporiesgoBean obj) {
        Tiporiesgo tiporiesgo = new Tiporiesgo();
        tiporiesgo.setIdtipo(obj.getIdtipo());
        tiporiesgo.setDesctiporiesgo(obj.getDesctiporiesgo());
        getTiporiesgoDAO().actualizar(tiporiesgo);
        return true;
    }

    public boolean eliminar(TiporiesgoBean obj) {
        Tiporiesgo tiporiesgo = new Tiporiesgo();
        tiporiesgo.setIdtipo(obj.getIdtipo());
        tiporiesgo.setDesctiporiesgo(obj.getDesctiporiesgo());
        getTiporiesgoDAO().eliminar(tiporiesgo);
        return true;
    }

    public List listado() {
        List tiporiesgos = getTiporiesgoDAO().listado();
        return tiporiesgos;
    }

    /**
     * @return the tiporiesgoDAO
     */
    public TiporiesgoImpDAO getTiporiesgoDAO() {
        return tiporiesgoDAO;
    }

    /**
     * @param tiporiesgoDAO the tiporiesgoDAO to set
     */
    public void setTiporiesgoDAO(TiporiesgoImpDAO tiporiesgoDAO) {
        this.tiporiesgoDAO = tiporiesgoDAO;
    }
}
