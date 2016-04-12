/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.bo;

import com.srp.beans.ProcesoBean;
import com.srp.dao.ProcesoImpDAO;
import com.srp.persistencia.Area;
import com.srp.persistencia.Estado;
import com.srp.persistencia.Funcionario;
import com.srp.persistencia.Nombreproceso;
import com.srp.persistencia.Proceso;
import com.srp.persistencia.Procesoasociado;
import com.srp.persistencia.Regional;
import com.srp.persistencia.Riesgo;
import com.srp.persistencia.Seccional;
import com.srp.persistencia.Subarea;
import com.srp.persistencia.Tipoproceso;
import java.util.Date;
import java.util.List;
import reportes.MapaRiesgos;

/**
 *
 * @author jhecohe
 */
public class ProcesoImpBO implements ProcesoIntBO {

    private ProcesoImpDAO procesoDAO;
    private TipoprocesoImpBO tipoprocesoBO;
    private NombreprocesoImpBO nombreprocesoBO;
    private ProcesoasociadoImpBO procesoasociadoBO;
    private RegionalImpBO regionalBO;
    private SeccionalImpBO seccionalBO;
    private RiesgoImpBO riesgoBO;

    
    private AreaImpBO areaBO;
    private SubareaImpBO subareaBO;
    private FuncionarioImpBO funcionarioBO;
    private EstadoImpBO estadoBO;

    @Override
    public boolean agregar(ProcesoBean obj) {
        Proceso proceso = new Proceso();
        Subarea subarea = new Subarea();
        subarea.setIdsubarea(obj.getSubarea());
        Procesoasociado asociado = new Procesoasociado();
        asociado.setIdprocesoasociado(obj.getProcesoasociado());
        Funcionario funcionario = new Funcionario();
        funcionario.setIdfuncionario(obj.getFuncionario());
        Estado estado = new Estado();
        estado.setIdestado(1);
        String id = obj.getProcesoasociado()+""+ obj.getSubarea();
        Date fechainicio = new Date();

        proceso.setEstado(estado);
        proceso.setSubarea(subarea);
        proceso.setProcesoasociado(asociado);
        proceso.setFuncionario(funcionario);
        proceso.setCodigoproceso(id);
        proceso.setCreado(fechainicio);

        getProcesoDAO().agregar(proceso);
        return true;
    }

    @Override
    public boolean actualizar(Proceso obj, int idfuncionario, int idestado) {
        Funcionario funcionario = new Funcionario();
        funcionario.setIdfuncionario(idfuncionario);
        Estado estado = new Estado();
        estado.setIdestado(idestado);
        obj.setFuncionario(funcionario);
        obj.setEstado(estado);
        getProcesoDAO().actualizar(obj);
        return true;
    }

    @Override
    public boolean eleminar(ProcesoBean obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Proceso> listado() {
        return getProcesoDAO().listado();
    }
    
    public List<MapaRiesgos> listadoMapa(int riesgo) {
        return getProcesoDAO().listadoMapa(riesgo);
    }
        
    List<Proceso> procesoPorIdListado(int proceso) {
        return getProcesoDAO().procesoPorIdListado(proceso);
    }
    
    public List<Tipoproceso> tipoprocesoListado(){
        System.out.println("ProcesoImpBO tipoprocesoBO listado tipoproceso");
        return getTipoprocesoBO().listado();
    }
    
    public List<Nombreproceso> nombreprocesoPorTipoListado(int idtipo){
        return getNombreprocesoBO().listadoPorTipo(idtipo);
    }
    
    public List<Procesoasociado> procesoasociadoPorNombreListado(int idtipo){
        return getProcesoasociadoBO().listadoPorNombre(idtipo);
    }
    
    public List<Regional> regionalListado(){
        return getRegionalBO().listado();
    }
    
    public List<Seccional> seccionalPorRegionalListado(int idregional){
        return getSeccionalBO().listadoPorRegional(idregional);
    }
    
    public List<Area> areaPorSeccionalListado(int idseccional){
        return getAreaBO().listadoPorSeccional(idseccional);
    }
    
    public List<Subarea> subareaPorAreaListado(int idarea){
        return getSubareaBO().listadoPorArea(idarea);
    }
    
    public List<Funcionario> funcionarioPorSubarea(int idsubarea){
        System.out.println("ProcesoImpBO listado funcionario por subarea");
        return getFuncionarioBO().listadoPorSubarea(idsubarea);
    }
    
    public List<Riesgo> listadoRiesgos(){
        return getRiesgoBO().listado();
    }
    
    public List<Estado> estadoListado(){
        return getEstadoBO().listado();
    }

    /**
     * @return the procesoDAO
     */
    public ProcesoImpDAO getProcesoDAO() {
        return procesoDAO;
    }

    /**
     * @param procesoDAO the procesoDAO to set
     */
    public void setProcesoDAO(ProcesoImpDAO procesoDAO) {
        this.procesoDAO = procesoDAO;
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

    /**
     * @return the nombreprocesoBO
     */
    public NombreprocesoImpBO getNombreprocesoBO() {
        return nombreprocesoBO;
    }

    /**
     * @param nombreprocesoBO the nombreprocesoBO to set
     */
    public void setNombreprocesoBO(NombreprocesoImpBO nombreprocesoBO) {
        this.nombreprocesoBO = nombreprocesoBO;
    }

    /**
     * @return the procesoasociadoBO
     */
    public ProcesoasociadoImpBO getProcesoasociadoBO() {
        return procesoasociadoBO;
    }

    /**
     * @param procesoasociadoBO the procesoasociadoBO to set
     */
    public void setProcesoasociadoBO(ProcesoasociadoImpBO procesoasociadoBO) {
        this.procesoasociadoBO = procesoasociadoBO;
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

    /**
     * @return the funcionarioBO
     */
    public FuncionarioImpBO getFuncionarioBO() {
        return funcionarioBO;
    }

    /**
     * @param funcionarioBO the funcionarioBO to set
     */
    public void setFuncionarioBO(FuncionarioImpBO funcionarioBO) {
        this.funcionarioBO = funcionarioBO;
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
    
    public RiesgoImpBO getRiesgoBO() {
        return riesgoBO;
    }

    public void setRiesgoBO(RiesgoImpBO riesgoBO) {
        this.riesgoBO = riesgoBO;
    }
}
