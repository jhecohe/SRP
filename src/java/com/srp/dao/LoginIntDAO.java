/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.dao;

import com.srp.persistencia.Usuario;

/**
 *
 * @author jhecohe
 */
public interface LoginIntDAO {
    Usuario validaLogin(Usuario obj);
}
