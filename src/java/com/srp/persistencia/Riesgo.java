package com.srp.persistencia;
// Generated 23/05/2015 08:59:36 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Riesgo generated by hbm2java
 */
public class Riesgo  implements java.io.Serializable {


     private int idriesgo;
     private Estado estado;
     private Enfoque enfoque;
     private Tiporiesgo tiporiesgo;
     private Clasificacion clasificacion;
     private String nombre;
     private String descriesgo;
     private int entrada;
     private Set panoramasForIdefecto = new HashSet(0);
     private Set panoramasForIdcausa = new HashSet(0);
     private Set trazariesgos = new HashSet(0);

    public Riesgo() {
    }

	
    public Riesgo(int idriesgo, Estado estado, Enfoque enfoque, Tiporiesgo tiporiesgo, Clasificacion clasificacion, String nombre, String descriesgo, int entrada) {
        this.idriesgo = idriesgo;
        this.estado = estado;
        this.enfoque = enfoque;
        this.tiporiesgo = tiporiesgo;
        this.clasificacion = clasificacion;
        this.nombre = nombre;
        this.descriesgo = descriesgo;
        this.entrada = entrada;
    }
    public Riesgo(int idriesgo, Estado estado, Enfoque enfoque, Tiporiesgo tiporiesgo, Clasificacion clasificacion, String nombre, String descriesgo, int entrada, Set panoramasForIdefecto, Set panoramasForIdcausa, Set trazariesgos) {
       this.idriesgo = idriesgo;
       this.estado = estado;
       this.enfoque = enfoque;
       this.tiporiesgo = tiporiesgo;
       this.clasificacion = clasificacion;
       this.nombre = nombre;
       this.descriesgo = descriesgo;
       this.entrada = entrada;
       this.panoramasForIdefecto = panoramasForIdefecto;
       this.panoramasForIdcausa = panoramasForIdcausa;
       this.trazariesgos = trazariesgos;
    }
   
    public int getIdriesgo() {
        return this.idriesgo;
    }
    
    public void setIdriesgo(int idriesgo) {
        this.idriesgo = idriesgo;
    }
    public Estado getEstado() {
        return this.estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public Enfoque getEnfoque() {
        return this.enfoque;
    }
    
    public void setEnfoque(Enfoque enfoque) {
        this.enfoque = enfoque;
    }
    public Tiporiesgo getTiporiesgo() {
        return this.tiporiesgo;
    }
    
    public void setTiporiesgo(Tiporiesgo tiporiesgo) {
        this.tiporiesgo = tiporiesgo;
    }
    public Clasificacion getClasificacion() {
        return this.clasificacion;
    }
    
    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescriesgo() {
        return this.descriesgo;
    }
    
    public void setDescriesgo(String descriesgo) {
        this.descriesgo = descriesgo;
    }
    public int getEntrada() {
        return this.entrada;
    }
    
    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
    public Set getPanoramasForIdefecto() {
        return this.panoramasForIdefecto;
    }
    
    public void setPanoramasForIdefecto(Set panoramasForIdefecto) {
        this.panoramasForIdefecto = panoramasForIdefecto;
    }
    public Set getPanoramasForIdcausa() {
        return this.panoramasForIdcausa;
    }
    
    public void setPanoramasForIdcausa(Set panoramasForIdcausa) {
        this.panoramasForIdcausa = panoramasForIdcausa;
    }
    public Set getTrazariesgos() {
        return this.trazariesgos;
    }
    
    public void setTrazariesgos(Set trazariesgos) {
        this.trazariesgos = trazariesgos;
    }




}


