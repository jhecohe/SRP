/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srp.seguridad;

import com.srp.beans.LoginBean;
import com.srp.beans.UsuarioBean;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jhecohe
 */
public class FiltroGestor implements Filter{
    private FilterConfig configuracion;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.configuracion = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (((HttpServletRequest) request).getSession().getAttribute(
                LoginBean.USER_KEY) == null || !((UsuarioBean)((HttpServletRequest) request).getSession().getAttribute(
                LoginBean.USER_KEY)).getPerfil().equals("gestor de riesgo") ) {
            ((HttpServletResponse) response).sendRedirect("../index.jspx");
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
        configuracion = null;
    }
}
