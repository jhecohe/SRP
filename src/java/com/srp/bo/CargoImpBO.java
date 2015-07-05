/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.CargoBean;
import com.srp.dao.CargoImpDAO;
import com.srp.persistencia.Cargo;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class CargoImpBO {
    
    private CargoImpDAO cargoDAO;
    
    public boolean agregar (CargoBean obj){
        Cargo cargo = new Cargo();
        getCargoDAO().agregar(cargo);
        return true;
    }
    
    public boolean actualizar(Cargo obj, String desc){
        obj.setDesccargo(desc);
        getCargoDAO().actualizar(obj, desc);
        return true;
    }
    
    public List<Cargo> listado(){
        return getCargoDAO().lstado();
    }

    /**
     * @return the cargoDAO
     */
    public CargoImpDAO getCargoDAO() {
        return cargoDAO;
    }

    /**
     * @param cargoDAO the cargoDAO to set
     */
    public void setCargoDAO(CargoImpDAO cargoDAO) {
        this.cargoDAO = cargoDAO;
    }
}
