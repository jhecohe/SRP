/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.beans;

import static com.srp.beans.LoginBean.USER_KEY;
import com.srp.bo.RiesgoImpBO;
import com.srp.persistencia.Riesgo;
import java.util.List;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class RiesgoBean {
    
     private Integer idriesgo;
     private Integer estado;
     private Integer enfoque;
     private Integer tiporiesgo;
     private Integer clasificacion;
     private String nombre;
     private String descriesgo;
     private Integer entrada;
     private RiesgoImpBO riesgoBO;
     public static boolean adicionar;
     public static boolean modificar;
     
     public RiesgoBean(){
         String usuario = ((UsuarioBean)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(USER_KEY)).toString();
         System.out.println("Perfil---" + usuario);
     }
     
     public void agregar (){
         System.out.println("Agregar riesgo"+ estado +""+ enfoque +""+ tiporiesgo +""+ clasificacion +""+ nombre +""+ descriesgo +""+ entrada);
         getRiesgoBO().agregar(this);
     }
    
     public void actualizar(RowEditEvent event){
         Riesgo obj = (Riesgo) event.getObject();
         getRiesgoBO().actualizar(obj, estado);
     }
     
     public List<Riesgo> riesgoListado(){
         List<Riesgo> riesgos = getRiesgoBO().listado();
         return riesgos;
     }
     
     public List clasificacionListado(){
         System.out.println("Bean riesgo metodo clasificaionListado");
         List clasificacion = getRiesgoBO().clasificacionListado();
         return clasificacion;
     }
     
     public List enfoqueListado(){
         System.out.println("Bean riesgo metodo clasificaionListado");
         List enfoque = getRiesgoBO().enfoqueListado();
         return enfoque;
     }
     
     public List tiporiesgoListado(){
         System.out.println("Bean riesgo metodo clasificaionListado");
         List tiporiesgo = getRiesgoBO().tiporiesgoListado();
         return tiporiesgo;
     }
     
     public List estadoListado(){
         System.out.println("Bean riesgo metodo estadoListado");
         List estado = getRiesgoBO().estadoListado();
         return estado;
     }

    /**
     * @return the idriesgo
     */
    public Integer getIdriesgo() {
        return idriesgo;
    }

    /**
     * @param idriesgo the idriesgo to set
     */
    public void setIdriesgo(Integer idriesgo) {
        this.idriesgo = idriesgo;
    }

    /**
     * @return the estado
     */
    public Integer getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    /**
     * @return the enfoque
     */
    public Integer getEnfoque() {
        return enfoque;
    }

    /**
     * @param enfoque the enfoque to set
     */
    public void setEnfoque(Integer enfoque) {
        this.enfoque = enfoque;
    }

    /**
     * @return the tiporiesgo
     */
    public Integer getTiporiesgo() {
        return tiporiesgo;
    }

    /**
     * @param tiporiesgo the tiporiesgo to set
     */
    public void setTiporiesgo(Integer tiporiesgo) {
        this.tiporiesgo = tiporiesgo;
    }

    /**
     * @return the clasificacion
     */
    public Integer getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(Integer clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descriesgo
     */
    public String getDescriesgo() {
        return descriesgo;
    }

    /**
     * @param descriesgo the descriesgo to set
     */
    public void setDescriesgo(String descriesgo) {
        this.descriesgo = descriesgo;
    }

    /**
     * @return the entrada
     */
    public Integer getEntrada() {
        return entrada;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(Integer entrada) {
        this.entrada = entrada;
    }     

    /**
     * @return the riesgoBO
     */
    public RiesgoImpBO getRiesgoBO() {
        return riesgoBO;
    }

    /**
     * @param riesgoBO the riesgoBO to set
     */
    public void setRiesgoBO(RiesgoImpBO riesgoBO) {
        this.riesgoBO = riesgoBO;
    }

    /**
     * @return the adicionar
     */
    public boolean isAdicionar() {
        return adicionar;
    }

    /**
     * @param adicionar the adicionar to set
     */
    public void setAdicionar(boolean adicionar) {
        this.adicionar = adicionar;
    }

    /**
     * @return the modificar
     */
    public boolean isModificar() {
        return modificar;
    }

    /**
     * @param modificar the modificar to set
     */
    public void setModificar(boolean modificar) {
        this.modificar = modificar;
    }
}
