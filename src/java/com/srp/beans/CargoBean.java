/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.beans;

import com.srp.bo.CargoImpBO;
import com.srp.persistencia.Cargo;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author jhecohe
 */
public class CargoBean {

    private int idcargo;
    private String desccargo;
    private CargoImpBO cargoBO;

    public void agregar(){
        getCargoBO().agregar(this);
    }
    
    public void actualizar(RowEditEvent event){
        Cargo cargo = (Cargo) event.getObject();
        getCargoBO().actualizar(cargo, desccargo);
    }
    
    public List listado(){
        return getCargoBO().listado();
    }
    /**
     * @return the idcargo
     */
    public int getIdcargo() {
        return idcargo;
    }

    /**
     * @param idcargo the idcargo to set
     */
    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
    }

    /**
     * @return the desccargo
     */
    public String getDesccargo() {
        return desccargo;
    }

    /**
     * @param desccargo the desccargo to set
     */
    public void setDesccargo(String desccargo) {
        this.desccargo = desccargo;
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
}
