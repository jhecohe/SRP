/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srp.bo;

import com.srp.beans.PerfilBean;
import com.srp.dao.PerfilImpDAO;
import com.srp.persistencia.Perfil;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public class PerfilImpBO implements Serializable {

    private PerfilImpDAO perfilDAO;
    private FuncionarioImpBO funcionarioBO;

    public boolean agregar(PerfilBean obj) {
        Perfil perfil = new Perfil();
        getPerfilDAO().agregar(perfil);
        return true;
    }

    public boolean actualizar(String[] modulo) throws IOException {

        for (int i = 0; i < modulo.length; i++) {
            Path copiar = Paths.get("/home/jhecohe/NetBeansProjects/SRP/web/Admin/" + modulo[i] + ".xhtml");
            Path pegar = Paths.get("/home/jhecohe/NetBeansProjects/SRP/web/pruebas/" + modulo[i] + ".xhtml");

            CopyOption[] options = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
            };
            Files.copy(copiar, pegar, options);
            System.out.println("Longitud arreglo modulo" + modulo.length + " Variable i" + i );
        }
        System.out.println("Termino");
        return true;
    }

    public List listado() {
        return getPerfilDAO().listado();
    }

    public List funcionarioListado() {
        return getFuncionarioBO().listado();
    }

    /**
     * @return the perfilDAO
     */
    public PerfilImpDAO getPerfilDAO() {
        return perfilDAO;
    }

    /**
     * @param perfilDAO the perfilDAO to set
     */
    public void setPerfilDAO(PerfilImpDAO perfilDAO) {
        this.perfilDAO = perfilDAO;
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
}
