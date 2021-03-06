/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.FuncionarioBean;
import com.srp.dao.FuncionarioImpDAO;
import com.srp.persistencia.Area;
import com.srp.persistencia.Cargo;
import com.srp.persistencia.Ciudad;
import com.srp.persistencia.Clase;
import com.srp.persistencia.Estado;
import com.srp.persistencia.Funcionario;
import com.srp.persistencia.Grado;
import com.srp.persistencia.Regional;
import com.srp.persistencia.Seccional;
import com.srp.persistencia.Subarea;
import java.util.List;
/**
 *
 * @author jhecohe
 */
public class FuncionarioImpBO implements FuncionarioIntBO {

    private FuncionarioImpDAO funcionarioDAO; 
    private CiudadImpBO ciudadBO;
    private CargoImpBO cargoBO;
    private GradoImpBO gradoBO;
    private ClaseImpBO claseBO;
    private RegionalImpBO regionalBO;
    private SeccionalImpBO seccionalBO;
    private AreaImpBO areaBO;
    private SubareaImpBO subareaBO;
    
    @Override
    public boolean agregar(FuncionarioBean obj) {
        
        Funcionario funcionario = new Funcionario();
        funcionario.setApellido(obj.getApellido());
        Cargo cargo = new Cargo();
        cargo.setIdcargo(obj.getCargo());
        funcionario.setCargo(cargo);
        Ciudad ciudadExp = new Ciudad();
        ciudadExp.setIdciudad(obj.getCiudadByCiuIdciudad());
        funcionario.setCiudadByCiuIdciudad(ciudadExp);
        Ciudad ciudadNac = new Ciudad();
        ciudadNac.setIdciudad(obj.getCiudadByCiuIdciudad2());
        funcionario.setCiudadByCiuIdciudad2(ciudadNac);
        Ciudad ciudadResi = new Ciudad();
        ciudadResi.setIdciudad(obj.getCiudadByIdciudad());
        funcionario.setCiudadByIdciudad(ciudadResi);
        Clase clase = new Clase();
        clase.setIdclase(obj.getClase());
        funcionario.setClase(clase);
        funcionario.setCorreo(obj.getCorreo());
        funcionario.setDireccion(obj.getDireccion());
        Estado estado = new Estado();
        estado.setIdestado(1);
        funcionario.setEstado(estado);
        funcionario.setFechanacimiento(obj.getFechanacimiento());
        Grado grado = new Grado();
        grado.setIdgrado(obj.getGrado());
        funcionario.setGrado(grado);
        funcionario.setIdentificacion(obj.getIdentificacion());
        funcionario.setNombre(obj.getNombre());
        funcionario.setSegapellido(obj.getSegapellido());
        funcionario.setSegnombre(obj.getSegnombre());
        Subarea subarea = new Subarea();
        subarea.setIdsubarea(obj.getSubarea());
        funcionario.setSubarea(subarea);
        funcionario.setTelefono(obj.getTelefono());
        
        getFuncionarioDAO().agregar(funcionario);
        return true;
    }

    @Override
    public boolean actualizar(Funcionario obj) {
        getFuncionarioDAO().actualizar(obj);
        return true;
    }

    @Override
    public boolean eliminar(Funcionario obj) {
        getFuncionarioDAO().eleminar(obj);
        return true;
    }

    @Override
    public List<Funcionario> listado() {
        return getFuncionarioDAO().listado();
    }
    
    @Override
    public List<Funcionario> listadoPorSubarea(int subarea) {
        return getFuncionarioDAO().listado(subarea);
    }
    
   public List<Funcionario> listadoPorPanorama(int idpanorama){
       return getFuncionarioDAO().listadoPorPanorma(idpanorama);
   }
    
    public List<Ciudad> listadoCiudad(){
        return getCiudadBO().listado();
    }
    
    public List<Cargo> listadoCargo(){
        return getCargoBO().listado();
    }
    
    public List<Grado> listadoGrado(){
        return getGradoBO().listado();
    }
    
    public List<Clase> listadoClase(){
        return getClaseBO().listados();
    }
    
    public List<Regional> listadoRegional(){
        return getRegionalBO().listado();
    }
    
    public List<Seccional> listadoSeccional(int idregional){
        return getSeccionalBO().listadoPorRegional(idregional);
    }
    
    public List<Area> listadoArea(int idseccional){
        return getAreaBO().listadoPorSeccional(idseccional);
    }
    
    public List<Subarea> listadoSubarea(int idarea){
        return getSubareaBO().listadoPorArea(idarea);
    }

    /**
     * @return the funcionarioDAO
     */
    public FuncionarioImpDAO getFuncionarioDAO() {
        return funcionarioDAO;
    }

    /**
     * @param funcionarioDAO the funcionarioDAO to set
     */
    public void setFuncionarioDAO(FuncionarioImpDAO funcionarioDAO) {
        this.funcionarioDAO = funcionarioDAO;
    }    

    /**
     * @return the ciudadBO
     */
    public CiudadImpBO getCiudadBO() {
        return ciudadBO;
    }

    /**
     * @param ciudadBO the ciudadBO to set
     */
    public void setCiudadBO(CiudadImpBO ciudadBO) {
        this.ciudadBO = ciudadBO;
    }

    /**
     * @return the cargoBO
     */
    public CargoImpBO getCargoBO() {
        return cargoBO;
    }

    /**
     * @param cargoBO the cargoBO to set
     */
    public void setCargoBO(CargoImpBO cargoBO) {
        this.cargoBO = cargoBO;
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

    /**
     * @return the claseBO
     */
    public ClaseImpBO getClaseBO() {
        return claseBO;
    }

    /**
     * @param claseBO the claseBO to set
     */
    public void setClaseBO(ClaseImpBO claseBO) {
        this.claseBO = claseBO;
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

    /**
     * @return the seccionalBO
     */
    public SeccionalImpBO getSeccionalBO() {
        return seccionalBO;
    }

    /**
     * @param seccionalBO the seccionalBO to set
     */
    public void setSeccionalBO(SeccionalImpBO seccionalBO) {
        this.seccionalBO = seccionalBO;
    }

    /**
     * @return the areaBO
     */
    public AreaImpBO getAreaBO() {
        return areaBO;
    }

    /**
     * @param areaBO the areaBO to set
     */
    public void setAreaBO(AreaImpBO areaBO) {
        this.areaBO = areaBO;
    }

    /**
     * @return the subareaBO
     */
    public SubareaImpBO getSubareaBO() {
        return subareaBO;
    }

    /**
     * @param subareaBO the subareaBO to set
     */
    public void setSubareaBO(SubareaImpBO subareaBO) {
        this.subareaBO = subareaBO;
    }
}
