/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Funcionario;
import java.util.List;

/**
 *
 * @author jhecohe
 */
public interface FuncionarioIntDAO {
    public boolean agregar(Funcionario obj);
    public boolean actualizar(Funcionario obj);
    public boolean eleminar(Funcionario obj);
    public List<Funcionario> listado();
    public List<Funcionario> listado(int idsubarea);
}
