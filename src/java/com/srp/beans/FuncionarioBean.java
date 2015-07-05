/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.FuncionarioImpBO;
import com.srp.persistencia.Funcionario;
import java.util.Date;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class FuncionarioBean {

    private int idfuncionario;
    private int grado;
    private int estado;
    private int ciudadByCiuIdciudad2;
    private int cargo;
    private int ciudadByCiuIdciudad;
    private int ciudadByIdciudad;
    private int subarea;
    private int clase;
    private String nombre;
    private String segnombre;
    private String apellido;
    private String segapellido;
    private int identificacion;
    private Date fechanacimiento;
    private String telefono;
    private String correo;
    private String direccion;
    private int region;
    private int seccional;
    private int area;
    private FuncionarioImpBO funcionarioBO;
    
    public void agregar(){
        getFuncionarioBO().agregar(this);
    }
    
    public void actualizar(RowEditEvent event){
        Funcionario funcionario = (Funcionario) event.getObject();
        getFuncionarioBO().actualizar(funcionario);
    }
    
    public List listado(){
        return getFuncionarioBO().listado();
    }
    /**
     * @return the idfuncionario
     */
    public int getIdfuncionario() {
        return idfuncionario;
    }

    /**
     * @param idfuncionario the idfuncionario to set
     */
    public void setIdfuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }
    
    public List listadoCiudad(){
        return getFuncionarioBO().listadoCiudad();
    }
    
    public List listadoCargo(){
        return getFuncionarioBO().listadoCargo();
    }
    
    public List listadoGrado(){
        return getFuncionarioBO().listadoGrado();
    }
    
    public List listadoClase(){
        return getFuncionarioBO().listadoClase();
    }
    
    public List listadoRegional(){
        return getFuncionarioBO().listadoRegional();
    }
    
    public List listadoSeccional(){
        return getFuncionarioBO().listadoSeccional();
    }
    
    public List listadoArea(){
        return getFuncionarioBO().listadoArea();
    }
    
    public List listadoSubarea(){
        return getFuncionarioBO().listadoSubarea();
    }

    /**
     * @return the grado
     */
    public int getGrado() {
        return grado;
    }

    /**
     * @param grado the grado to set
     */
    public void setGrado(int grado) {
        this.grado = grado;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the ciudadByCiuIdciudad2
     */
    public int getCiudadByCiuIdciudad2() {
        return ciudadByCiuIdciudad2;
    }

    /**
     * @param ciudadByCiuIdciudad2 the ciudadByCiuIdciudad2 to set
     */
    public void setCiudadByCiuIdciudad2(int ciudadByCiuIdciudad2) {
        this.ciudadByCiuIdciudad2 = ciudadByCiuIdciudad2;
    }

    /**
     * @return the cargo
     */
    public int getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the ciudadByCiuIdciudad
     */
    public int getCiudadByCiuIdciudad() {
        return ciudadByCiuIdciudad;
    }

    /**
     * @param ciudadByCiuIdciudad the ciudadByCiuIdciudad to set
     */
    public void setCiudadByCiuIdciudad(int ciudadByCiuIdciudad) {
        this.ciudadByCiuIdciudad = ciudadByCiuIdciudad;
    }

    /**
     * @return the ciudadByIdciudad
     */
    public int getCiudadByIdciudad() {
        return ciudadByIdciudad;
    }

    /**
     * @param ciudadByIdciudad the ciudadByIdciudad to set
     */
    public void setCiudadByIdciudad(int ciudadByIdciudad) {
        this.ciudadByIdciudad = ciudadByIdciudad;
    }

    /**
     * @return the subarea
     */
    public int getSubarea() {
        return subarea;
    }

    /**
     * @param subarea the subarea to set
     */
    public void setSubarea(int subarea) {
        this.subarea = subarea;
    }

    /**
     * @return the clase
     */
    public int getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(int clase) {
        this.clase = clase;
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
     * @return the segnombre
     */
    public String getSegnombre() {
        return segnombre;
    }

    /**
     * @param segnombre the segnombre to set
     */
    public void setSegnombre(String segnombre) {
        this.segnombre = segnombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the segapellido
     */
    public String getSegapellido() {
        return segapellido;
    }

    /**
     * @param segapellido the segapellido to set
     */
    public void setSegapellido(String segapellido) {
        this.segapellido = segapellido;
    }

    /**
     * @return the identificacion
     */
    public int getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * @return the fechanacimiento
     */
    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    /**
     * @param fechanacimiento the fechanacimiento to set
     */
    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
     * @return the region
     */
    public int getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(int region) {
        this.region = region;
    }

    /**
     * @return the seccional
     */
    public int getSeccional() {
        return seccional;
    }

    /**
     * @param seccional the seccional to set
     */
    public void setSeccional(int seccional) {
        this.seccional = seccional;
    }

    /**
     * @return the area
     */
    public int getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(int area) {
        this.area = area;
    }
}
