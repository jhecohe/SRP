/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.bo;

import com.srp.beans.FuncionarioBean;
import com.srp.persistencia.Funcionario;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public interface FuncionarioIntBO {
    public boolean agregar(FuncionarioBean obj);
    public boolean actualizar(Funcionario obj);
    public boolean eliminar(Funcionario obj);
    public List<Funcionario> listado();
    public List<Funcionario> listadoPorSubarea(int subarea);
}
