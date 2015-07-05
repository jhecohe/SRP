/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.RiesgoBean;
import com.srp.dao.RiesgoImpDAO;
import com.srp.persistencia.Clasificacion;
import com.srp.persistencia.Enfoque;
import com.srp.persistencia.Estado;
import com.srp.persistencia.Riesgo;
import com.srp.persistencia.Tiporiesgo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class RiesgoImpBO implements RiesgoIntBO {
    
    private RiesgoImpDAO riesgoDAO;
    private ClasificacionImpBO clasificacionBO;
    private EnfoqueImpBO enfoqueBO;
    private TiporiesgoImpBO tiporiesgoBO;
    private EstadoImpBO estadoBO;

    @Override
    public boolean agregar(RiesgoBean obj) {
        System.out.println("Agregar riesgoBO");
        Riesgo riesgo = new Riesgo();
        Clasificacion clasificacion = new Clasificacion();
        clasificacion.setIdclasificacion(obj.getClasificacion());
        riesgo.setClasificacion(clasificacion);
        riesgo.setDescriesgo(obj.getDescriesgo());
        Enfoque enfoque = new Enfoque();
        enfoque.setIdenfoque(obj.getEnfoque());
        riesgo.setEnfoque(enfoque);
        Estado estado = new Estado();
        estado.setIdestado(1);
        riesgo.setEstado(estado);
        riesgo.setNombre(obj.getNombre());
        Tiporiesgo tiporiesgo = new Tiporiesgo();
        tiporiesgo.setIdtipo(obj.getTiporiesgo());
        riesgo.setTiporiesgo(tiporiesgo);
        
        getRiesgoDAO().agregar(riesgo);
        return true;
    }

    @Override
    public boolean actualizar(Riesgo obj, int idestado) {  
        Estado estado = new Estado();
        estado.setIdestado(idestado);
        obj.setEstado(estado);
        getRiesgoDAO().actualizar(obj);
        return true;
    }

    @Override
    public List<Riesgo> listado() {
        List<Riesgo> riesgos = getRiesgoDAO().listado();
        return riesgos;
    }
    
    public List clasificacionListado(){
         System.out.println("Bean riesgo metodo clasificaionListado");
         List clasificacion = getClasificacionBO().listado();
         return clasificacion;
     }
    
    public List enfoqueListado(){
         System.out.println("Bean riesgo metodo enfoqueListado");
         List enfoque = getEnfoqueBO().listado();
         return enfoque;
     }
    
    public List tiporiesgoListado(){
         System.out.println("Bean riesgo metodo enfoqueListado");
         List tiporiesgo = getTiporiesgoBO().listado();
         return tiporiesgo;
     }
    
    public List estadoListado(){
         System.out.println("Bean riesgo metodo estadoListado");
         List estado = getEstadoBO().listado();
         return estado;
     }
        
    /**
     * @return the riesgoDAO
     */
    public RiesgoImpDAO getRiesgoDAO() {
        return riesgoDAO;
    }

    /**
     * @param riesgoDAO the riesgoDAO to set
     */
    public void setRiesgoDAO(RiesgoImpDAO riesgoDAO) {
        this.riesgoDAO = riesgoDAO;
    }

    /**
     * @return the clasificacionBO
     */
    public ClasificacionImpBO getClasificacionBO() {
        return clasificacionBO;
    }

    /**
     * @param clasificacionBO the clasificacionBO to set
     */
    public void setClasificacionBO(ClasificacionImpBO clasificacionBO) {
        this.clasificacionBO = clasificacionBO;
    }

    /**
     * @return the enfoqueBO
     */
    public EnfoqueImpBO getEnfoqueBO() {
        return enfoqueBO;
    }

    /**
     * @param enfoqueBO the enfoqueBO to set
     */
    public void setEnfoqueBO(EnfoqueImpBO enfoqueBO) {
        this.enfoqueBO = enfoqueBO;
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

    /**
     * @return the estadoBO
     */
    public EstadoImpBO getEstadoBO() {
        return estadoBO;
    }

    /**
     * @param estadoBO the estadoBO to set
     */
    public void setEstadoBO(EstadoImpBO estadoBO) {
        this.estadoBO = estadoBO;
    }
    
}
